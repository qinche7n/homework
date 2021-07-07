package day17;

import java.io.*;

public class work4 {
    public static void main(String[] args) throws IOException {
        //递归查找指定目录中(包括子目录中)，所有的.java文件，
        //并且，把所有这些找到的java文件，复制(是复制不是移动)到一个指定的目录下
        //创建文件对象
        File file = new File("/Users/sacrific7e/IdeaProjects/homework/src/day01");
        //将其传入复制方法
        copy(new File("/Users/sacrific7e/IdeaProjects/homework/src/day01"),new File("/Users/sacrific7e/Desktop/copy"));
        //复制方法
        //检查传入的对象是文件还是夹
        //是夹,查看其文件数组,递归调用复制方法
        //是文件,复制到目标文件夹
    }
    //复制方法
    public static void copy(File file,File targetDir) throws IOException {
        if (file.isDirectory()){
            File  files[]=file.listFiles();
            for (File i:files){
                copy(i,targetDir);
            }
        }else if(file.isFile()){
            if (file.getName().endsWith(".java")) {
                FileInputStream in = new FileInputStream(file);
                String targetFileString = targetDir.getAbsolutePath()+"/"+ file.getName();
                new File(targetFileString).createNewFile();
                FileOutputStream out = new FileOutputStream(targetFileString,true);
                int readcount;
                byte[] bytes = new byte[8192];
                while ((readcount=in.read(bytes))!=-1){
                    out.write(bytes,0,readcount);
                }
                in.close();
                out.close();
            }
        }
    }

}
