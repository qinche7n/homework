package _test;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class StopThread5 {


    /**
     * @description: 安全终止线程
     * @author: songtao@cskaoyan.onaliyun.com
     **/

        /*
        主线程打印3个数

        子线程打印10个数

        定义boolean flag 去控制线程终止

        当子线程终止的时候, 向文件当中输出一个中断标记,
         log.txt  当前时间 年月日  时分秒 + 子线程中断字符串 写入文件
         */
    public static void main(String[] args) {
        // 创建线程对象
        MyThread myThread = new MyThread();
        // 启动线程
        myThread.start();
        // 主线程打印3个数
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 更改flag值
        myThread.flag = false;
    }
}

class MyThread extends Thread {
    boolean flag = true;
    // run

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (flag) {
                // flag为true表明没有被中断
                // 正常打印
                System.out.println(getName() + "------" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                // 说明子线程被中断
                // 向log.txt文件中输出中断信息
                // 创建输出流对象
                try {
                    FileWriter fileWriter = new FileWriter("log.txt");
                    // 写数据
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String dateStr = simpleDateFormat.format(new Date());
                    fileWriter.write(dateStr + " :" + "发生了中断");
                    fileWriter.write(System.lineSeparator());
                    fileWriter.flush();

                    // close
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                // 保存数据的操作.....
            }

        }
    }
}

