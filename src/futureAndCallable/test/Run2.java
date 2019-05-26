package futureAndCallable.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Run2 {
    public static void main(String[] args) {
        try {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("打印的信息");
                }
            };
            ExecutorService executorService = Executors.newCachedThreadPool();
            Future future = executorService.submit(runnable);
            System.out.println(future.get()+" "+future.isDone());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException i) {
            i.printStackTrace();

        }
    }
}