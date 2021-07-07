package day21;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Work1 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        pool.submit(new PrintTask());
        pool.submit(new PrintTask());
        pool.submit(new PrintTask());
        pool.submit(new PrintTask());
        pool.shutdown();

    }
}

class PrintTask implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        int sleepTime = random.nextInt(9);
        try {
            Thread.sleep(sleepTime*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "休眠了" + sleepTime);
    }
}
