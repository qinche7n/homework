package day20;

public class work4 {
    public static void main(String[] args) {
        //启动2个线程 打印100个数** (使用wait notify)**
        //    线程a 打印 1 3 5 7 9 ...奇数
        //    线程b 打印 2 4 6 8 10 ...偶数
        //    分析：线程a打印的是奇数 线程b打印的是偶数

        //创建一个打印机对象,为争抢对象
        PrintMachine printMachine = new PrintMachine();
        Thread thread = new Thread(new PrintEvenTask(printMachine), "偶数打印机");
        Thread thread1 = new Thread(new PrintOddTask(printMachine), "奇数打印机");
        thread.start();
        thread1.start();
    }
}


class PrintMachine {
    int count = 0;


}

class PrintOddTask implements Runnable {
    PrintMachine printMachine;

    public PrintOddTask(PrintMachine printMachine) {
        this.printMachine = printMachine;
    }

    @Override
    public void run() {
        while (printMachine.count <= 100) {
            synchronized (printMachine) {
                if ((printMachine.count % 2) == 1) {
                    System.out.println(Thread.currentThread().getName() + "------" + printMachine.count);
                    printMachine.count++;
                    printMachine.notify();
                } else {
                    try {
                        printMachine.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class PrintEvenTask implements Runnable {
    PrintMachine printMachine;

    public PrintEvenTask(PrintMachine printMachine) {
        this.printMachine = printMachine;
    }

    @Override
    public void run() {
        synchronized (printMachine) {
            while (printMachine.count <= 100) {
                if ((printMachine.count % 2) == 0) {
                    System.out.println(Thread.currentThread().getName() + "------" + printMachine.count);
                    printMachine.count++;
                    printMachine.notify();
                } else {
                    try {
                        printMachine.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}