package edu.poly.IT17328.thang;

import java.util.ArrayList;

public class Bai1 {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(1);
        a.add("hello word");

        Integer i = (Integer) a.get(0);
        String s = (String) a.get(2);
    }

}
