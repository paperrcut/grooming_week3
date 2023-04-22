package com.practice.week3.Multithreading;

public class SimultaneousThread extends Thread {
    private String name;
    SimultaneousThread(String name) {
        this.name=name;
        }
    public void run()
    {
        for(int i=1;i<=5;i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread:" + name + " Iteration: "+i);
        }
    }

    public static void main(String[] args)
    {
        SimultaneousThread t1 = new SimultaneousThread("1");
        SimultaneousThread t2 = new SimultaneousThread("2");
        t1.start();
        t2.start();
    }
}
