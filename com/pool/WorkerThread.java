package com.pool;

public class WorkerThread implements Runnable {
    private final String msg;

    public WorkerThread(String msg){
        this.msg = msg;
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+msg);
        processMessage();
        System.out.println(Thread.currentThread().getName()+" (END)");
    }

    private void processMessage() {
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
