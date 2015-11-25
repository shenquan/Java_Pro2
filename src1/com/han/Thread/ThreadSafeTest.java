package com.han.Thread;

/**
 * Created by HSQ on 2015/11/25.
 */
public class ThreadSafeTest implements Runnable {
    int num = 10;

    /*@Override
    public void run() {
        *//*while (true) {
            synchronized (new Object()) {
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
        }*//*
    }*/

    public static void main(String[] args) {
        ThreadSafeTest t = new ThreadSafeTest();
        Thread tA = new Thread(t);
        Thread tB = new Thread(t);
        Thread tC = new Thread(t);
        Thread tD = new Thread(t);
        System.out.println("t.num1="+t.num);

        tA.start();
        tB.start();
        tC.start();
        tD.start();
        System.out.println("t.num=" + t.num);

        ThreadSafeTest m=new ThreadSafeTest();//num还是10  因为这是一个新的对象 资源都是新的
        Thread tE=new Thread(m);
        tE.start();
    }

    @Override
    public void run() {
        while (true) {
            if (num > 0) {
                doIt();
            } else {
                break;
            }
        }
    }

//    private boolean flag = true;

    public synchronized void doIt() {
        try {
            Thread.sleep(100);
            System.out.println("tickets" + --num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
