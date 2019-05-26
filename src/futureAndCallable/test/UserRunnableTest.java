package futureAndCallable.test;

import futureAndCallable.entity.Userinfo;
import futureAndCallable.mycallable.UserRunnable;

import java.util.concurrent.*;

public class UserRunnableTest {

    FutureTask abc;

    public static void main(String[] args) {
        try {
            Userinfo userinfo = new Userinfo();
            UserRunnable userRunnable = new UserRunnable(userinfo);
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10,10,
                    10, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
            Future<Userinfo> future = threadPoolExecutor.submit(userRunnable,userinfo);
            System.out.println("begin time"+System.currentTimeMillis());
            userinfo = future.get();
            System.out.println("get Value "+userinfo.getUsername()+" "+userinfo.getPassword());
            System.out.println("end time"+System.currentTimeMillis());
            System.out.println(future.getClass().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
