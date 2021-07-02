package day05;

public class Work2 {
    public static void main(String[] args) {
        NewStudent stu1 = new NewStudent("张三", 18, "男", 1);
        NewStudent stu2 = new NewStudent("李四",25,"女",2);
        stu1.print();
        stu2.print();

    }
}


class student{
    String name;
    int age;
    String gender;
    int stuId;

    public student(){

    }

    public student(String name) {
        this.name = name;
    }

    public student(String name, int stuId) {
        this.name = name;
        this.stuId = stuId;
    }

    public student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public student(String name, int age, String gender, int stuId) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.stuId = stuId;
    }

    //无法创建一个构造方法单独给gender赋值
    public void print(){
        System.out.println(this);
    }

    public void printinfo(){
        System.out.println("名字："+this.name);
        System.out.println("年龄"+this.age);
        System.out.println("性别"+this.gender);
        System.out.println("学号"+this.stuId);
    }
}


