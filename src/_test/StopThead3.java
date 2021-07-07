package _test;

public class StopThead3 {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            public void run() {
                System.out.println("线程启动了");
                while (!isInterrupted()) {
                    System.out.println(isInterrupted());//调用 interrupt 之后为true
                }
                System.out.println("线程结束了");
            }
        };
        thread.start();

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
        System.out.println("线程是否被中断：" + thread.isInterrupted());//true
    }
}
