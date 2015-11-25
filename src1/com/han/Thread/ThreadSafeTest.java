package com.han.Thread;

/**
 * Created by HSQ on 2015/11/25.
 */
public class ThreadSafeTest implements Runnable {
    int num = 10;

    @Override
    public void run() {
        while (true) {
            synchronized ("") {
                if (num > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("num= " + --num);
                } else {
                    System.out.println("k");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
//                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadSafeTest t = new ThreadSafeTest();
        Thread tA = new Thread(t);
        Thread tB = new Thread(t);
        Thread tC = new Thread(t);
        Thread tD = new Thread(t);

        tA.start();
        tB.start();
        tC.start();
        tD.start();
    }

}
