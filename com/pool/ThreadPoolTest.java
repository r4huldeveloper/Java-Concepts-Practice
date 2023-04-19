package com.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++){
            Runnable worker = new WorkerThread(""+i);
            executorService.execute(worker);
        }
        executorService.shutdown();

        System.out.println("Finished all threads");
    }
}
