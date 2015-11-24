package com.han.enumtest;

/**
 * Created by HSQ on 2015/11/24.
 */
interface Constants {
    public static final int Constants_A = 1;
    public static final int Constants_B = 12;
}

public class ConstantsTest {
    enum Constants2 {
        Constants_A, Constants_B
    }

    public static void doit(int c) {
        switch (c) {
            case Constants.Constants_A:
                System.out.println("doit()Constants_A");

            case Constants.Constants_B:
                System.out.println("doit()Constants_B");
            case 5:
                System.out.println("doit()Constants_X");
            default:
                System.out.println("xxxxxxxxxxxxxxx");
        }
    }

    public static void doit2(Constants2 c) {
        switch (c) {
            case Constants_A:
                System.out.println("doit2() Constants_A");
                break;
            case Constants_B:
                System.out.println("doit2() Constants_B");
                break;
        }
    }

    public static void main(String[] args) {
        ConstantsTest.doit(100);
        ConstantsTest.doit(Constants.Constants_B);
        ConstantsTest.doit2(Constants2.Constants_A);
        ConstantsTest.doit2(Constants2.Constants_B);
        ConstantsTest.doit(3);
//        ConstantsTest.doit2(5);
    }
}
