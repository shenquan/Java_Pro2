package com.han.fanxing;

import java.awt.geom.FlatteningPathIterator;

import static java.lang.System.out;

/**
 * Created by HSQ on 2015/11/24.
 */
public class OverClass<T1> {
    private T1 over;

    public T1 getOver() {
        return over;
    }

    public void setOver(T1 over) {
        this.over = over;
    }

    public static void main(String[] args) {
        OverClass<Boolean> over1 = new OverClass<>();
        OverClass<Float> over2 = new OverClass<>();
        over1.setOver(true);
        Boolean b=over1.getOver();
        out.println(b);
        over2.setOver(2f);
        Float f=over2.getOver();
        out.println(f);

        OverClass<Float> over3 = new OverClass<>();
        over2.setOver(24.3f);
        Float i = over2.getOver();
    }

}
