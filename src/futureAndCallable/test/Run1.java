package futureAndCallable.test;

import futureAndCallable.mycallable.MyCallable;

import java.util.concurrent.*;

/**
 * get()具有阻塞特性
 */
public class Run1 {

    public static void main(String[] args) {
        try {
            MyCallable myCallable = new MyCallable(99);
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3,
                    5L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
            Future<String> future = threadPoolExecutor.submit(myCallable);
            System.out.println("main A" + System.currentTimeMillis());
            System.out.println(future.get());
            System.out.println("main B" + System.currentTimeMillis());
            System.out.println(future.cancel(true)+" "+future.isCancelled());
        }catch (ExecutionException e){
            e.printStackTrace();
        }catch (InterruptedException e2){
            e2.printStackTrace();
        }
    }

}
