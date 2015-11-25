package com.han.fanxing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by HSQ on 2015/11/24.
 */
public class A <T extends List>{
    public void doSomething(A<?super List>a){

    }
    public void do1(A<? extends List> b){

    }
    public void do2(){

    }
    public static void main(String[]args){
        A<? extends List> a= new A<LinkedList>();
        A<? extends List> b=new A<ArrayList>();
        List<String> l1 =new ArrayList<>();
        l1.add("成员");
        List<?> l2=l1;
        List<?> l3=new LinkedList<Integer>();
//        l3.add(3);
        System.out.println(l2.get(0));

        l1.set(0,"成员改变");
//        l2.set(0,"个");
//        l3.set(0,1);
        l2.get(0);
        l2.remove(0);
//        l3.get(0);
    }
}
class test{

    public static void main(String[]args){

        A<? extends List> a= null;
        a=new A<ArrayList>();
        a=new A<LinkedList>();
        A<? extends List > b= new A<ArrayList>();
        A<? extends List> c=new A<LinkedList>();

    }
}
class ExtendClass<T1>{

}
class SubClass<T1,T2,T3> extends ExtendClass<T1>{

}
interface i<T1>{

}
class SubClass2<T1,T2,T3> implements i<T1>{

}