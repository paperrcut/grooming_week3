package com.practice.week3.Executor_Framework;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkClass {
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i= 0;i<5;i++)
        {
            executorService.submit(new TaskClass(i+""));
        }
        executorService.shutdown();
    }
}
