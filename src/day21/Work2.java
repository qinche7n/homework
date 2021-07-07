//package day21;
//
//
//
//import java.io.*;
//import java.util.concurrent.Callable;
//
//public class Work2 {
//
//
//    public static void main(String[] args) {
//        //**用Callable的方式去实现之前的多线程文件复制**
//        //
//        //复制成功后,返回复制成功的文件路径,并利用Callable的方式接收返回值,然后把这几个路径都保存到新的文件中.
//        File file = new File("map.jpg");
//        File file1 = new File("copymap1.jpg");
//        File file2 = new File("copyLines.txt");
//        File file3 = new File("copyLines1.txt");
//        CopyFileThread1 copyFileThread = new CopyFileThread1(file, file1);
//        CopyFileThread1 copyFileThread1 = new CopyFileThread1(file2, file3);
//
//
//        Thread thread = new Thread(copyFileThread);
//        Thread thread1 =new Thread(copyFileThread1);
//        thread.start();
//        thread1.start();
//    }
//    //创建一个复制文件进程类
//    //继承进程
//    //重写run方法
//
//}
//
//
//class CopyFileThread1 implements Callable {
//    File originalFile = null;
//    File copyFile = null;
//
//    public CopyFileThread1() {
//    }
//
//    public CopyFileThread1(File originalFile, File copyFile) {
//        this.copyFile = copyFile;
//        this.originalFile = originalFile;
//    }
//
//    //创建两个流对象
//    //获取文件长度
//    //读且写
//    //计算已经复制的占总文件的多少
//    @Override
//    public String call() {
//        FileInputStream in = null;
//        FileOutputStream out = null;
//        try {
//            in = new FileInputStream(originalFile);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        try {
//            out = new FileOutputStream(copyFile);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        long length = originalFile.length();
//        int readcount = 0;
//        byte bytes[] = new byte[32];
//        double readdingcount = 0;
//        while (true) {
//            try {
//                if (!((readcount = in.read(bytes)) != -1)) break;
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                out.write(bytes, 0, readcount);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            readdingcount += 32;
//            System.out.println(originalFile.getName() + "已经复制了" + (readdingcount / length) * 100 + "%");
//        }
//        try {
//            out.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            in.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return copyFile.getName();
//    }
//}
