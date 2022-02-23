package by.gbyzzz.task05multithreading.service.impl;

public class MatrixMTSetUp {
    public static int totalTasks(final Number[][] arr) {
        int tasks = 1;
        if (arr.length >= arr[0].length) {
            tasks = arr.length;
        } else if (arr.length < arr[0].length) {
            tasks = arr[0].length;
        }
        return tasks;
    }

    public static String taskTarget(final Number[][] arr) {
        String taskTarget = null;
        if (arr.length >= arr[0].length) {
            taskTarget = "row";
        } else if (arr.length < arr[0].length) {
            taskTarget = "column";
        }
        return taskTarget;
    }

    public static int tasksToThread(final int tasks, final int maxTreads) {
        int tasksToThread;
        if (tasks > maxTreads) {
            tasksToThread = tasks / maxTreads;
            if (tasks % maxTreads > 0) {
                tasksToThread++;
            }
        } else {
            tasksToThread = 1;
        }
        return tasksToThread;
    }

}
