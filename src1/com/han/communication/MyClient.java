package com.han.communication;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by HSQ on 2015/11/26.
 */
public class MyClient extends JFrame {
    private PrintWriter writer;
    Socket socket;
    private JTextArea ta = new JTextArea();
    private JTextField tf = new JTextField();
    Container cc;
    public MyClient(String title){
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cc=this.getContentPane();
        final JScrollPane scrollPane=new JScrollPane();
        scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
        getContentPane().add(scrollPane,BorderLayout.CENTER);
        scrollPane.setViewportView(ta);
        cc.add(tf,"South");
        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writer.println(tf.getText());
                ta.append(tf.getText()+"\n");
                ta.setSelectionEnd(ta.getText().length());
                tf.setText("");
            }
        });
    }
    private void connect(){
        ta.append("尝试连接\n");
        try{
            socket = new Socket("127.0.0.1",9000);
            writer = new PrintWriter(socket.getOutputStream(),true);
            ta.append("完成连接\n");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String [] args){
        MyClient client= new MyClient("向服务器送数据");
        client.setSize(500,500);
        client.setVisible(true);
        client.connect();
    }
}
