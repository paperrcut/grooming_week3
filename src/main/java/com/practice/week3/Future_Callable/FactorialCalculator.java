package com.practice.week3.Future_Callable;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.concurrent.*;

@Getter
@AllArgsConstructor
public class FactorialCalculator implements Callable<Long> {
    private long n;
    @Override
    public Long call() {
        long factorial=1;
        for(long i=n;i>1;i--)
        {
            factorial=factorial*i;
        }
        return factorial;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int n=10;
        FactorialCalculator factorialCalculator=new FactorialCalculator(n);
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        Future<Long> future = executorService.submit(factorialCalculator);
        long factorial = future.get();
        System.out.println(n+"! = "+factorial);
        executorService.shutdown();
    }
}
