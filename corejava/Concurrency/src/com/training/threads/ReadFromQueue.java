package com.training.threads;

import java.util.concurrent.BlockingQueue;

public class ReadFromQueue implements Runnable {

    protected BlockingQueue<String> queue = null;

    public ReadFromQueue(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
