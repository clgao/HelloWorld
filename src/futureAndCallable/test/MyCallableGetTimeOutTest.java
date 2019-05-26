package futureAndCallable.test;

import futureAndCallable.mycallable.MyCallableGetTimeOut;

import java.util.concurrent.*;

public class MyCallableGetTimeOutTest {
    public static void main(String[] args) {
        try {
            MyCallableGetTimeOut myCallableGetTimeOut = new MyCallableGetTimeOut();
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,3,
                    5, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
            System.out.println("begin " +System.currentTimeMillis());
            Future<String> future = threadPoolExecutor.submit(myCallableGetTimeOut);
            System.out.println("返回值"+future.get(5,TimeUnit.SECONDS));
            System.out.println("end" +System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
