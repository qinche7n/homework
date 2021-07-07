package day19;

public class work2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new T1("T1"));
        Thread t2 = new Thread(new T2("T2"));
        Thread t3 = new Thread(new T3("T3"));
        //要求:现在有T1、T2、T3三个线程，你怎样保证T2在T1执行完后执行，T3在T2执行完后执行？

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();

        t3.join();
    }

}

class  T1 extends Thread{
    public T1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName()+ "-" +i);
        }

    }
}


class  T2 extends Thread{
    public T2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName()+"-" +i);
        }

    }
}

class  T3 extends Thread{
    public T3(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName()+"-" +i);
        }

    }
}