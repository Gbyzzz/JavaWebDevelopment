package by.gbyzzz.task05multithreading.service.impl.matrixmultithreading;

import by.gbyzzz.task05multithreading.beans.MyArray;
import by.gbyzzz.task05multithreading.dal.FileIOFactory;
import by.gbyzzz.task05multithreading.service.ArrayService;
import by.gbyzzz.task05multithreading.service.ValidatorService;
import by.gbyzzz.task05multithreading.service.factory.ServiceFactory;

public class AdditionMT implements ArrayService, Runnable {
    private static int tasks;
    private static String taskTarget = new String();
    private static int tasksToThread = 1;
    private static Thread[] threads;
    private static int i = 0;
    private static Number[][] arr1 = new Number[0][0];
    private static Number[][] arr2 = new Number[0][0];
    private static Number[][] res = new Number[0][0];

    @Override
    public MyArray execute(String... matrix) {
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        MyArray matrixOne = fileIOFactory.getFileIO().readFileToArray(matrix[0]);
        MyArray matrixTwo = fileIOFactory.getFileIO().readFileToArray(matrix[1]);
        ValidatorService validatorService = serviceFactory.getValidatorService();

         arr1 = matrixOne.getArr();
         arr2 = matrixTwo.getArr();
         res = matrixTwo.getArr();
        tasks = totalTasks(arr1);
        taskTarget = taskTarget(arr1);
        int maxTreads = Integer.parseInt(matrix[2]);
        tasksToThread = tasksToThread(tasks, maxTreads);
        if (tasks > maxTreads){
            threads = new Thread[maxTreads-1];
        } else {
            threads = new Thread[tasks];
        }
        for (; i < threads.length; i++) {
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
        if(taskTarget.equals("row")){
            for (int r = tasksToThread * i; r < tasksToThread * (i+1); r++){
                for (int j = 0; j < arr1[r].length; j++){
                    res[r][j] = arr1[r][j].intValue() + arr2[r][j].intValue();
                    System.out.println("exec" + Thread.currentThread());
                }
            }
        } else if(taskTarget.equals("column")){
            for (int s = tasksToThread * i; s < tasksToThread * (i+1); s++){
                for (int j = 0; j < arr1.length; j++){
                    res[j][s] = arr1[j][s].intValue() + arr2[j][s].intValue();
                    System.out.println("exec" + Thread.currentThread());
                }
            }
        }
    }

    private int totalTasks(Number[][] arr){
        int tasks = 1;
        if (arr.length >= arr[0].length){
            tasks = arr.length;
        } else if (arr.length < arr[0].length) {
            tasks = arr[0].length;
        }
        return tasks;
    }

    private String taskTarget(Number[][] arr){
        String taskTarget = null;
        if (arr.length >= arr[0].length){
            taskTarget = "row";
        } else if (arr.length < arr[0].length) {
            taskTarget = "column";
        }
        return taskTarget;
    }

    private int tasksToThread (int tasks, int maxTreads) {
        int tasksToThread;

        if (tasks > maxTreads) {
            tasksToThread = tasks / maxTreads;
            if (tasks % maxTreads > 0) {
                tasksToThread++;
            }
        } else {
            tasksToThread = tasks;
        }
        return tasksToThread;
    }
}
