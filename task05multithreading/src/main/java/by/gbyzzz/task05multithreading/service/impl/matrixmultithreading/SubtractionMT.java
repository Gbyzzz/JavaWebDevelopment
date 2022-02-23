package by.gbyzzz.task05multithreading.service.impl.matrixmultithreading;

import by.gbyzzz.task05multithreading.beans.MyArray;
import by.gbyzzz.task05multithreading.dal.FileIOFactory;
import by.gbyzzz.task05multithreading.service.ArrayService;
import by.gbyzzz.task05multithreading.service.ValidatorService;
import by.gbyzzz.task05multithreading.service.factory.ServiceFactory;
import by.gbyzzz.task05multithreading.service.impl.MatrixMTSetUp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.*;

public class SubtractionMT implements ArrayService, Runnable {
    private static final Logger LOGGER = LogManager.getLogger();
    private static int tasks;
    private static String taskTarget = new String();
    private static int tasksToThread = 1;
    private static Number[][] arr1 = new Number[0][0];
    private static Number[][] arr2 = new Number[0][0];
    private static Number[][] res = new Number[0][0];
    private static CountDownLatch countDownLatch = new CountDownLatch(5);

    @Override
    public MyArray execute(final String... matrix) {
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        MyArray matrixOne = fileIOFactory.getFileIO().readFileToArray(matrix[0]);
        MyArray matrixTwo = fileIOFactory.getFileIO().readFileToArray(matrix[1]);
        ValidatorService validatorService = serviceFactory.getValidatorService();
        arr1 = matrixOne.getArr();
        tasks = MatrixMTSetUp.totalTasks(arr1);
        int maxTreads = Integer.parseInt(matrix[2]);
        int threadsToWork = (maxTreads > tasks) ? tasks : maxTreads;
        tasksToThread = MatrixMTSetUp.tasksToThread(tasks, maxTreads);
        arr2 = matrixTwo.getArr();
        res = matrixTwo.getArr();
        taskTarget = MatrixMTSetUp.taskTarget(arr1);


        ExecutorService executorService = Executors.newFixedThreadPool(maxTreads);

        for (int i = 0; i < threadsToWork; i++) {
            executorService.execute(new SubtractionMT());
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        matrixOne.setArr(res);
        return matrixOne;
    }

    @Override
    public void run() {
        LOGGER.trace(Thread.currentThread().getName() + " is working");
        int a = Integer.parseInt(Thread.currentThread().getName().substring(14));
        if (taskTarget.equals("row")) {
            System.out.println("exec" + Thread.currentThread());
            for (int r = tasksToThread * (a - 1); r < tasksToThread * a; r++) {
                for (int j = 0; j < arr1[r].length; j++) {
                    res[r][j] = arr1[r][j].intValue() - arr2[r][j].intValue();

                }
            }
        } else if (taskTarget.equals("column")) {
            System.out.println("exec" + Thread.currentThread() + "  " + a);
            for (int s = tasksToThread * (a - 1); s < tasksToThread * a; s++) {
                for (int j = 0; j < arr1.length; j++) {
                    res[j][s] = arr1[j][s].intValue() - arr2[j][s].intValue();
                }
            }
        }
        countDownLatch.countDown();
    }


}
