package com.han.enumtest;
import static java.lang.System.out;
/**
 * Created by HSQ on 2015/11/24.
 */
public class EnumIndexTest {
    enum Constants2 {
        C1, C2, C3;
    }

    public static void main(String[] args) {
        for(int i=0;i<Constants2.values().length;i++){
            out.println(Constants2.values()[i]+"在枚举类索引中位置索引为"+Constants2.values()[i].ordinal());
        }
    }
}
