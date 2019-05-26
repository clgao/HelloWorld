package test;

import myrunnable.MyRunnable3;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ShutdownNowTest2 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable3 myRunnable3 = new MyRunnable3();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,99999,9999L,
                TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        threadPoolExecutor.execute(myRunnable3);
        threadPoolExecutor.execute(myRunnable3);
        threadPoolExecutor.execute(myRunnable3);
        threadPoolExecutor.execute(myRunnable3);
        Thread.sleep(1000);
        threadPoolExecutor.shutdownNow();
        System.out.println("main end");
    }
}
