package com.han.Thread;

/**
 * Created by HSQ on 2015/11/25.
 */
public class InterruptedTest implements Runnable {
    private boolean isContinue = false;
    public void setContinue(){
        isContinue=true;
    }
    public void run(){
        while (true){
            if(isContinue){
                break;
            }
        }
    }
}
