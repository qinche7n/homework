package _test;


public class StopThread1 {
    public static void main(String[] args) {
        // 创建线程对象
        StopThread stopThread = new StopThread();
        // start
        // 主线程打印3个数
        stopThread.setPriority(Thread.MAX_PRIORITY);
        stopThread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(i);

            if (i == 50) {
                stopThread.interrupt();
            }


        }
        // 调用interrupt方法  通过异常处理机制
        // 泼了一盆水 去唤醒 但是 并没有中断线程
    }
}

class StopThread extends Thread {
    //run

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "-----" + i);
            System.out.println(this.isInterrupted());
            if (i==40){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (i==80){
                System.out.println("我要休眠了");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

