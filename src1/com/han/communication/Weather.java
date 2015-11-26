package com.han.communication;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

/**
 * Created by HSQ on 2015/11/26.
 */
public class Weather extends Thread {
    String weather = "广播请收听";
    int port = 9000;
    InetAddress iaddress = null;
    MulticastSocket socket = null;
    Weather(){
        try{
            iaddress=InetAddress.getByName("224.255.10.0");
            socket = new MulticastSocket(port);
            socket.setTimeToLive(1);
            socket.joinGroup(iaddress);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //run()
    public void run(){
        while (true){
            DatagramPacket packet=null;
            byte data[]=weather.getBytes();
            //将数据打包
            packet = new DatagramPacket(data,data.length,iaddress,port);
            System.out.println(new String(data));
            try{
                socket.send(packet);
                sleep(1000);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        Weather w = new Weather();
        w.start();
    }

}
