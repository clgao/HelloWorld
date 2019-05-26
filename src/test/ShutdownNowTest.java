package test;

import myrunnable.MyRunnable2;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ShutdownNowTest {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable2 myRunnable2 = new MyRunnable2();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,99999,9999L,
                TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        threadPoolExecutor.execute(myRunnable2);
        threadPoolExecutor.execute(myRunnable2);
        threadPoolExecutor.execute(myRunnable2);
        threadPoolExecutor.execute(myRunnable2);
        Thread.sleep(1000);
        threadPoolExecutor.shutdownNow();
    }
}
