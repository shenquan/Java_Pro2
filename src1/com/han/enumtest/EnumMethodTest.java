package com.han.enumtest;
import static java.lang.System.out;
//import java.lang.Enum;
/**
 * Created by HSQ on 2015/11/24.
 */
public class EnumMethodTest {
    enum C{
        A1,A2,A3
    }
    public static void compare(C c){
        for(int i=0;i<C.values().length;i++){
            out.println(c+"与"+C.values()[i]+"的比较结果为:"+c.compareTo(C.values()[i]));
        }
    }
    public static void main(String [] args){
//        EnumMethodTest.compare(C.A2);
        compare(C.valueOf("A3"));
    }
}
