package com.han.enumtest;

import static java.lang.System.out;

/**
 * Created by HSQ on 2015/11/24.
 */
public class EnumIndexTest2 {
    enum Constants2 {
        Constants_A("我是A"),
        Constants_B("我是B"),
        Constants_C(3);
        private String description;
        private int i = 4;

        private Constants2() {

        }

        private Constants2(String s) {
            this.description = s;
        }

        private Constants2(int i) {
            this.i = this.i + i;
        }

        public String getDescription() {
            return description;
        }

        public int getI() {
            return i;
        }
//        Constants_A("我是A");//不能放在后面
    }

    public static void main(String[] args) {
        for (int i = 0; i < Constants2.values().length; i++) {
            out.println(EnumIndexTest.Constants2.values()[i]+"调用getDescription方法为："+Constants2.values()[i].getDescription());
            out.println(Constants2.values()[i].getI());
            out.println(EnumIndexTest.Constants2.values()[i]);
        }

    }

}
