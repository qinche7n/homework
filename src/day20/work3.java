package day20;

        import java.lang.reflect.Parameter;
        import java.math.BigDecimal;

public class work3 {
    public static void main(String[] args) {
        //用多线程代码来模拟，迅雷用3个线程下载100M资源的的过程
        //
        //每个线程每次，一次下载1兆(M)资源，直到下载完毕，即剩余的待下载资源大小为0
        //
        // (用一个整数表示资源大小，每次个线程每次下载多少兆(M), 剩余待下载资源就减少多少兆(M)，
        //
        //  模拟我们售票的代码实现，考虑多线程的数据安全问题)

        //创建一个售票runnable对象
        DownloadMachine downloadMachine = new DownloadMachine(100);
        //创建三个进程
        new Thread(downloadMachine,"T1").start();
        new Thread(downloadMachine,"T2").start();
        new Thread(downloadMachine,"T3").start();


    }
}

//创建一个下载类
class DownloadMachine implements Runnable {

    double fileSize = 1;
    double doneSize = 0;

    public DownloadMachine() {
    }

    public DownloadMachine(long fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始下载了");
        while ((fileSize - doneSize) >2) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            download();
        }
    }

    //创建一个同步方法
    private synchronized void download() {
        doneSize++;
        System.out.println(Thread.currentThread().getName() + "下载了1M,完成了" + ((doneSize) / fileSize * 100) + "%");

    }
}