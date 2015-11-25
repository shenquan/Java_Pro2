package com.han.fanxing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * Created by HSQ on 2015/11/24.
 */
public class AnyClass {
    public static void main(String[]args){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(23);
//        int i=1;
        for(int i=0;i<a.size();i++){
            System.out.println("获取ArrayList容器的值："+a.get(i));
        }
        Map<Integer,String> m = new HashMap<>();
        for(int i=0;i<5;i++){
            m.put(i,"成员"+i);
        }
        for(int i=0;i<m.size();i++){
            System.out.println(m.get(i));
        }

        Vector<String> v = new Vector<>();
        for(int i=0;i<5;i++){
            v.add("成员"+i);
        }
        for(int i=0;i<v.size();i++){
            System.out.println("获取Vector容器的值"+v.get(i));
        }

    }
}
