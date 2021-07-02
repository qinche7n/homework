package day05;

public class Work3 {
    public static void main(String[] args) {
        NewStudent stu1 = new NewStudent("张三", 18, "男", 1,98);
        NewStudent stu2 = new NewStudent("李四",25,"女",2,93);
        NewStudent stu3 = new NewStudent("张四",21,"女",3,90);
        NewStudent stu4 = new NewStudent("李五",15,"女",4,99);
        NewStudent stu5 = new NewStudent("赵二",18,"男",5,96);
        stu1.printinfo();
        stu2.printinfo();
        stu3.printinfo();
        stu4.printinfo();
        stu5.printinfo();
        System.out.println("平均分"+(stu1.score+stu2.score+stu3.score+stu4.score+stu5.score)/5);

    }
}


class NewStudent {
    String name;
    int age;
    String gender;
    int stuId;
    double score;


    public NewStudent(){

    }

    public NewStudent(String name) {
        this.name = name;
    }

    public NewStudent(String name, int stuId) {
        this.name = name;
        this.stuId = stuId;
    }

    public NewStudent(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public NewStudent(String name, int age, String gender, int stuId) {
        this(name,age,gender);
        this.stuId = stuId;
    }

    public NewStudent(String name, int age, String gender, int stuId, double score) {
        this( name, age, gender,stuId);
        this.score = score;
    }

    public void print(){
        System.out.println(this);
    }


    public void printinfo(){
        System.out.println("名字："+this.name);
        System.out.println("年龄"+this.age);
        System.out.println("性别"+this.gender);
        System.out.println("学号"+this.stuId);
        System.out.println("成绩"+this.score);
    }
}


