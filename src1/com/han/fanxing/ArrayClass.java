package com.han.fanxing;

import static java.lang.System.out;

/**
 * Created by HSQ on 2015/11/24.
 */
public class ArrayClass<T> {
    private T[] array;
//    private T[] a=new T[10];

    public void setT(T[] array) {
        this.array = array;
    }

    public T[] getT() {
        return array;
    }

    public static void main(String[] args) {
        ArrayClass<String> a = new ArrayClass<>();
        String s[]={"1","2","3"};
        a.setT(s);
        for(int i=0;i<a.getT().length;i++){
            out.println(a.getT()[i]);
        }

        for(String s1:a.getT()){
            out.println(s1);
        }
//        out.println(s1);
    }
}
