package com.han.enumtest;
import static java.lang.System.out;
/**
 * Created by HSQ on 2015/11/24.
 */
interface d{
    String getDescription();
    int getI();
}
public enum AnyEnum implements d{
    CA{
      public String getDescription(){
          return "我是A";
      }
        public int getI(){
            return i;
        }
    },
    CB{
        public String getDescription(){
            return "我是B";
        }
        public int getI(){
            return i;
        }
    };
    private static int i=5;
    public static void main(String[]args){
        for(int i=0;i<AnyEnum.values().length;i++){
            out.println(AnyEnum.values()[i].getDescription());
            out.println(AnyEnum.values()[i].getI());
        }
    }
}
