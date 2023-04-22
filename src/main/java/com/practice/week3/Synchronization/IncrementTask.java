package com.practice.week3.Synchronization;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IncrementTask implements Runnable{
    private Counter counter;
    @Override
    public void run() {
        for (int i=0;i<100;i++)
            counter.increment();
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter1 = new Counter();
        IncrementTask task1 = new IncrementTask(counter1);
        IncrementTask task2 = new IncrementTask(counter1);
        IncrementTask task3 = new IncrementTask(counter1);

        /*task1.run();
        task2.run();
        task3.run();*/

        Thread t1 =new Thread(task1);
        Thread t2 =new Thread(task2);
        Thread t3 =new Thread(task3);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Counter: "+counter1.getCount());
    }
}
