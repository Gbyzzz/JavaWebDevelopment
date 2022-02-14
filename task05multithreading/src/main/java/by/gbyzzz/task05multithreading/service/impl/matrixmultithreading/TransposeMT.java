package by.gbyzzz.task05multithreading.service.impl.matrixmultithreading;

import by.gbyzzz.task05multithreading.beans.MyArray;
import by.gbyzzz.task05multithreading.dal.FileIOFactory;
import by.gbyzzz.task05multithreading.service.ArrayService;
import by.gbyzzz.task05multithreading.service.ValidatorService;
import by.gbyzzz.task05multithreading.service.factory.ServiceFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

public class TransposeMT implements ArrayService, Runnable {
    private static final Logger LOGGER = LogManager.getLogger();
    private static Phaser phaser = new Phaser();
    private static Number[][] arr1;
    private static Number[][] res;
    private static int tasksToThread;


    @Override
    public MyArray execute(final String... matrix) {
        phaser.register();
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        MyArray matrixOne = fileIOFactory.getFileIO().readFileToArray(matrix[0]);
        ValidatorService validatorService = serviceFactory.getValidatorService();
        arr1 = matrixOne.getArr();
        res = new Number[arr1[0].length][arr1.length];
        int tasks = arr1.length;

        int maxThreads = Integer.parseInt(matrix[1]);
        tasksToThread = (maxThreads >= tasks) ? 1 : ((tasks % maxThreads == 0) ? tasks / maxThreads : tasks / maxThreads + 1);
        int threads = (tasks >= maxThreads) ? maxThreads : tasks;
        ExecutorService executorService = Executors.newFixedThreadPool(threads);
        for (int i = 0; i <= threads; i++) {
            executorService.execute(new TransposeMT());
        }
        phaser.arriveAndAwaitAdvance();
        matrixOne.setArr(res);
        return matrixOne;
    }

    @Override
    public void run() {
        LOGGER.trace(Thread.currentThread().getName() + " is working");
        int i = Integer.parseInt(Thread.currentThread().getName().substring(14));
        phaser.register();
        for (int r = tasksToThread * (i - 1); r < tasksToThread * i; r++) {
            for (int j = 0; j < arr1[r].length; j++) {
                res[j][r] = arr1[r][j].intValue();
            }
        }
        phaser.arriveAndAwaitAdvance();
    }
}
