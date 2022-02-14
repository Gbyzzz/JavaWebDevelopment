package by.gbyzzz.task05multithreading.service.impl.matrixmultithreading;

import by.gbyzzz.task05multithreading.beans.MyArray;
import by.gbyzzz.task05multithreading.dal.FileIOFactory;
import by.gbyzzz.task05multithreading.service.ArrayService;
import by.gbyzzz.task05multithreading.service.factory.ServiceFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;

public class MultiplicationOnNumMT implements ArrayService, Callable<Number[]> {
    private static final Logger LOGGER = LogManager.getLogger();
    private static Semaphore semaphore = new Semaphore(3);
    private static String taskTarget;
    private static Number[][] arr1;
    private static int tasks = 1;
    private static int i = 0;
    private static int taskToThread;
    private static int numToMult;

    @Override
    public MyArray execute(final String... matrix) {
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        MyArray matrixOne = fileIOFactory.getFileIO().readFileToArray(matrix[0]);
        arr1 = matrixOne.getArr();
        Number[][] arr2 = arr1;
        MatrixMTSetUp setUp = new MatrixMTSetUp();
        tasks = arr1.length;
        numToMult = Integer.parseInt(matrix[1]);
        taskTarget = setUp.taskTarget(arr1);
        taskToThread = setUp.tasksToThread(tasks, Integer.parseInt(matrix[2]));
        ExecutorService executorService = Executors.newFixedThreadPool(Integer.parseInt(matrix[2]));
        try {
        for (; i < tasks; i++) {
                Future<Number[]> future = executorService.submit(new MultiplicationOnNumMT());
                arr2[i] = future.get();
        }
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        matrixOne.setArr(arr2);

        return matrixOne;
    }

    @Override
    public Number[] call() throws Exception {
        LOGGER.trace(Thread.currentThread().getName() + " is working");
        semaphore.acquire();
        Number[] arr;
        arr = arr1[i];
        for (int r = 0; r < arr.length; r++) {
            arr[r] = (Integer) arr[r] * numToMult;
        }
        semaphore.release();
        return arr;
    }
}
