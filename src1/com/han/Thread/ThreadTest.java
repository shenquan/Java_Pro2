package com.han.Thread;

/**
 * Created by HSQ on 2015/11/25.
 */
public class ThreadTest extends Thread {
    private int count = 10;

    public void run() {
        while (true) {
            System.out.println(count + " ");
            if (--count == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        try {
            new ThreadTest().start();
        } finally {
            new ThreadTest().start();
        }

    }
}


