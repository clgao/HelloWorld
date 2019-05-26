package test;

import myrunnable.MyRunnable1;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void main(String[] args) {
        MyRunnable1 myRunnable1 = new MyRunnable1();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(7,10,0L, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        pool.execute(myRunnable1);
        System.out.println("main end");
    }
}
