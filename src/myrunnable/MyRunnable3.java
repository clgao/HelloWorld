package myrunnable;

public class MyRunnable3 implements  Runnable {
    @Override
    public void run() {
            for (int i = 0; i < Integer.MAX_VALUE/1000; i++) {
                String ns = "";
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
            }
            System.out.println("任务成功完成！");
    }
}
