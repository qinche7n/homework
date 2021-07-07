package day20;

public class Work1 {
    //knock all !!!



        public static void main(String[] args) {
            // 创建子类对象
            SellWindow2 sellWindow = new SellWindow2();
            // 启动3个线程
            Thread t1 = new Thread(sellWindow);
            Thread t2 = new Thread(sellWindow);
            Thread t3 = new Thread(sellWindow);
            t1.setName("A");
            t2.setName("B");
            t3.setName("C");
            t1.start();
            t2.start();
            t3.start();
        }
    }

    class SellWindow2 implements Runnable {

        int tickets = 100;
        //Object obj = new Object();
        int i = 0;

        @Override
        public void run() {
            // 卖票
            while (true) {
                if (i % 2 == 0) {
                    synchronized (this) {
                        if (tickets > 0) {
                            try {
                                Thread.sleep(2);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println(Thread.currentThread().getName() +
                                    "卖了第" + tickets-- + "票");
                        }
                    }
                } else {
                    sell();
                }
                i++;

                if (tickets  == 1){
                    break;
                }


            }
        }

        private synchronized void sell() {

            if (tickets == 0) {
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() +
                        "卖了第" + tickets-- + "票");
            }
        }
    }

