package com.practice.week3.Executor_Framework;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TaskClass implements Runnable{

    private String task;
    @Override
    public void run() {
        System.out.println("Task: "+task+" Thread: "+Thread.currentThread().getName());
    }
}
