package com.han.fanxing;
import static java.lang.System.out;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by HSQ on 2015/11/24.
 */
public class MutilOverClass<K, V> {
    public Map<K,V> m =new HashMap<>();//上转型对象
    public void put(K k,V v){
        m.put(k,v);
    }
    public V get(K k){
        return m.get(k);
    }
    public static void main(String[]args){
        MutilOverClass<Integer,String> mu = new MutilOverClass<>();
        for(int i=0;i<5;i++){
            mu.put(i,i+"是我");
        }
        for(int i=0;i<5;i++){
            out.println(mu.get(i));
        }
        for(int i=0;i<mu.m.size();i++){
            out.println(mu.get(i));
        }
    }


}
