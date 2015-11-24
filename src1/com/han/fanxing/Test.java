package com.han.fanxing;

/**
 * Created by HSQ on 2015/11/24.
 */
public class Test {
    private Object b;
    public Object getB(){
        return b;
    }
    public void setB(Object b){
        this.b=b;
    }
    public static void main(String[]args){
        Test t=new Test();
        t.setB(new Boolean(true));//向上转型
        System.out.println(t.getB());
        t.setB(new Float(12.3));
        Float f=(Float)(t.getB());
        System.out.println(f);//向下转型

        t.setB(new Integer(42));
        Integer f2=(Integer)(t.getB());
        System.out.println(f2);//向下转型

        t.setB(new Float(42.3f));
        Integer f1=(Integer)(t.getB());
        System.out.println(f1);//向下转型失败


    }
}
