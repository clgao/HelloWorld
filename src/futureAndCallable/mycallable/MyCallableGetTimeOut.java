package futureAndCallable.mycallable;

import java.util.concurrent.Callable;

public class MyCallableGetTimeOut implements Callable<String> {

    public String call() throws Exception {
        Thread.sleep(10000);
        System.out.println("sleep 10秒鐘執行完了。");
        return "anyString";
    }

}
