package day19;

import java.io.*;

public class work1 {
    public static void main(String[] args) {
        //使用多线程实现方式一 ,多个文件一起复制功能，并在控制台显示复制的进度，进度以百分比表示。**
        //
        //例如：把文件A复制到E盘某文件夹下，在控制台上显示“XXX文件已复制xx%”，
        //“XXX文件已复制xxx%”……“XXX文件已复制xxx%”，“XXX复制完成！”
        //创建多个复制文件复制进程
        //启动
        File file = new File("map.jpg");
        File file1 = new File("copymap1.jpg");
        File file2 = new File("copyLines.txt");
        File file3 = new File("copyLines1.txt");
        CopyFileThread copyFileThread = new CopyFileThread(file, file1);
        CopyFileThread copyFileThread1 = new CopyFileThread(file2, file3);
        copyFileThread.start();
        copyFileThread1.start();
    }
    //创建一个复制文件进程类
    //继承进程
    //重写run方法

}

class CopyFileThread extends Thread {
    File originalFile = null;
    File copyFile = null;

    public CopyFileThread() {
    }

    public CopyFileThread(File originalFile, File copyFile) {
        this.copyFile = copyFile;
        this.originalFile = originalFile;
    }

    //创建两个流对象
    //获取文件长度
    //读且写
    //计算已经复制的占总文件的多少
    @Override
    public void run() {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(originalFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            out = new FileOutputStream(copyFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        long length = originalFile.length();
        int readcount = 0;
        byte bytes[] = new byte[32];
        double readdingcount = 0;
        while (true) {
            try {
                if (!((readcount = in.read(bytes)) != -1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.write(bytes, 0, readcount);
            } catch (IOException e) {
                e.printStackTrace();
            }
            readdingcount += 32;
            System.out.println(originalFile.getName() + "已经复制了" + (readdingcount / length) * 100 + "%");
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

