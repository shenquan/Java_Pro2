package com.han.communication;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by HSQ on 2015/11/26.
 */
public class Address {
    public static void main(String[]args){
        InetAddress ip;
        try{
            ip =InetAddress.getLocalHost();
            String localname=ip.getHostName();
            String localip=ip.getHostAddress();
            System.out.println("本几名为"+localname);
            System.out.println("本机ip地址为"+localip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
