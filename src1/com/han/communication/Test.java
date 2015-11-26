package com.han.communication;

/**
 * Created by HSQ on 2015/11/26.
 */
class DatabaseTest {
    public static void main(String[] args) {
        String s1 = new String("select name,age from tb_emp where sex='女' order by age;");
        String s2 = new String("insert into tb_emp values(2,'lili','女','销售部');");
        String s3 = new String("update tb_emp set age = 24 where id =2;");
        String s4 =
                new String("delete from tb_emp where id" +
                " = 1024;");
        System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4);
    }
}
