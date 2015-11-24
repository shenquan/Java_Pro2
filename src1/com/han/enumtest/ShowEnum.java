package com.han.enumtest;

/**
 * Created by HSQ on 2015/11/24.
 */
public class ShowEnum {
    enum Constants2{
        Constansts_A,Constansts_B,C3
    }
    public static void main(String []args){
        for(int i=0;i<Constants2.values().length;i++){
            System.out.println(Constants2.values()[i]);
        }
    }
}
