package by.gbyzzz.task05multithreading.service.impl.matrixmultithreading;

import by.gbyzzz.task05multithreading.beans.MyArray;
import by.gbyzzz.task05multithreading.dal.FileIOFactory;
import by.gbyzzz.task05multithreading.service.ArrayService;
import by.gbyzzz.task05multithreading.service.factory.ServiceFactory;

import java.util.concurrent.*;

public class MultiplicationOnNumMT implements ArrayService, Callable<Number[]> {
    private static Semaphore semaphore = new Semaphore(3);
    private static String taskTarget;
    private static Number[][] arr1;
    private static int tasks = 1;
    private static int i = 0;
    private static int taskToThread;
    private static int numToMult;

    @Override
    public MyArray execute(String... matrix) {
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
        semaphore.acquire();
        Number[] arr;
//        if (taskTarget.equals("row")) {
        arr = arr1[i];
        for (int r = 0; r < arr.length; r++) {
            arr[r] = (Integer) arr[r] * numToMult;
//            }
//        } else {
//            arr = new Number[arr1[0].length];
//            for(int c = 0; c < arr1[0].length; c++){
//                arr[c] = (Integer) arr1[c][i] * numToMult;
//            }
        }
        semaphore.release();
        return arr;
    }
}
