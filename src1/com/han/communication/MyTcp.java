package com.han.communication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by HSQ on 2015/11/26.
 */
public class MyTcp {
    private BufferedReader reader;
    private ServerSocket server;
    private Socket socket;

    void getServer() {
        try {
            server = new ServerSocket(9000);
            System.out.println("服务器套接字已经创建成功");
            while (true) {
                System.out.println("等待客户机的连接");
                socket = server.accept();
                System.out.println("连接中");
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                getClientMessage();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getClientMessage() {
        try {
            while (true) {
                System.out.println("客户机：" + reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            if(reader!=null){
                reader.close();
            }
            if(socket!=null){
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[]args){
        MyTcp tcp = new MyTcp();
        tcp.getServer();
    }

}
