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
    private static Phaser phaserCheck = new Phaser();
    private static Number[][] arr1;
    private static Number[][] res;
    private static int tasksToThread;
    private static int threads;

    @Override
    public MyArray execute(final String... matrix) {
        phaser.register();
        phaserCheck.register();
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        MyArray matrixOne = fileIOFactory.getFileIO().readFileToArray(matrix[0]);
        arr1 = matrixOne.getArr();
        res = new Number[arr1[0].length][arr1.length];
        int tasks = arr1.length;

        int maxThreads = Integer.parseInt(matrix[1]);
        tasksToThread = (maxThreads >= tasks) ? 1 : ((tasks % maxThreads == 0) ? tasks / maxThreads : tasks / maxThreads + 1);
        threads = (tasks >= maxThreads) ? maxThreads : tasks;
        threads ++;
        ExecutorService executorService = Executors.newFixedThreadPool(threads);
        for (int i = 0; i <= threads; i++) {
            executorService.execute(new TransposeMT());
        }
        phaser.arriveAndAwaitAdvance();
        phaserCheck.arriveAndAwaitAdvance();
        matrixOne.setArr(res);
        return matrixOne;
    }

    @Override
    public void run() {
        LOGGER.trace(Thread.currentThread().getName() + " is working");
        int v = Integer.parseInt(Thread.currentThread().getName().substring(14));
        if (v < threads) {
            phaser.register();
            for (int i = tasksToThread * (v - 1); i < tasksToThread * v; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    res[j][i] = arr1[i][j].intValue();
                }
            }
            phaser.arriveAndAwaitAdvance();
        } else {
            phaserCheck.register();
            for(int i = 0; i < res.length; i++){
                for (int j = 0; j < res[i].length; j++){
                    if(res[i][j] == null){
                        res[i][j] = arr1[j][i];
                    }
                }
            }
            phaserCheck.arriveAndAwaitAdvance();
        }
    }
}
