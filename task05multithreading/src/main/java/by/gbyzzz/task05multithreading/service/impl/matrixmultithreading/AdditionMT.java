package by.gbyzzz.task05multithreading.service.impl.matrixmultithreading;

import by.gbyzzz.task05multithreading.beans.MyArray;
import by.gbyzzz.task05multithreading.dal.FileIOFactory;
import by.gbyzzz.task05multithreading.service.ArrayService;
import by.gbyzzz.task05multithreading.service.ValidatorService;
import by.gbyzzz.task05multithreading.service.factory.ServiceFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AdditionMT implements ArrayService, Runnable {
    private static final Logger LOGGER = LogManager.getLogger();
    private static int tasks;
    private static String taskTarget = new String();
    private static int tasksToThread = 1;
    private static Thread[] threads;
    private static Number[][] arr1 = new Number[0][0];
    private static Number[][] arr2 = new Number[0][0];
    private static Number[][] res = new Number[0][0];

    @Override
    public MyArray execute(final String... matrix) {
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        MyArray matrixOne = fileIOFactory.getFileIO().readFileToArray(matrix[0]);
        MyArray matrixTwo = fileIOFactory.getFileIO().readFileToArray(matrix[1]);
        ValidatorService validatorService = serviceFactory.getValidatorService();

         arr1 = matrixOne.getArr();
         arr2 = matrixTwo.getArr();
         res = matrixTwo.getArr();
        tasks = MatrixMTSetUp.totalTasks(arr1);
        taskTarget = MatrixMTSetUp.taskTarget(arr1);
        int maxTreads = Integer.parseInt(matrix[2]);
        tasksToThread = MatrixMTSetUp.tasksToThread(tasks, maxTreads);
        if (tasks > maxTreads) {
            threads = new Thread[maxTreads];
        } else {
            threads = new Thread[tasks];
        }
        for (int i = 0; i < threads.length; i++) {
            try {
            threads[i] = new Thread(new AdditionMT());
            threads[i].start();
            threads[i].setPriority(10);
            threads[i].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }

        matrixOne.setArr(res);
        return matrixOne;
    }

    @Override
    public void run() {
        int v = Integer.parseInt(Thread.currentThread().getName().substring(7));
        LOGGER.trace("executing " + Thread.currentThread());
        if (taskTarget.equals("row")) {
            for (int r = tasksToThread * v; r < tasksToThread * (v + 1); r++) {
                for (int j = 0; j < arr1[r].length; j++) {
                    res[r][j] = arr1[r][j].intValue() + arr2[r][j].intValue();

                }
            }
        } else if (taskTarget.equals("column")) {
            for (int s = tasksToThread * v; s < tasksToThread * (v + 1); s++) {
                for (int j = 0; j < arr1.length; j++) {
                    System.out.println(s + Thread.currentThread().getName());
                    res[j][s] = arr1[j][s].intValue() + arr2[j][s].intValue();
                }
            }
        }
    }
}
