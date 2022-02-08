package by.gbyzzz.task05multithreading.service.impl.matrixmultithreading;

public class MatrixMTSetUp {
    public int totalTasks(Number[][] arr){
        int tasks = 1;
    if (arr.length >= arr[0].length){
        tasks = arr.length;
    } else if (arr.length < arr[0].length) {
        tasks = arr[0].length;
    }
    return tasks;
    }

    public String taskTarget(Number[][] arr){
        String taskTarget = null;
        if (arr.length >= arr[0].length){
            taskTarget = "row";
        } else if (arr.length < arr[0].length) {
            taskTarget = "column";
        }
        return taskTarget;
    }

    public int tasksToThread (int tasks, int maxTreads) {
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
