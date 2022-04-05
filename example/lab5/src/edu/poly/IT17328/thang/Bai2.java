
package edu.poly.IT17328.thang;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Bai2 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(10.4);
        list.add(14.4);
        list.add(2.4);
        int lenght = list.size();
        System.out.println(list.get(1));
        System.out.println(lenght);
        
        for(int i = 0; i < lenght; i++){
            System.out.println(list.get(i));
        }
        
        for(Double item : list){
            System.out.println(item);
        }
        
        Collections.sort(list);
        for(Double item : list){
            System.out.println(item);
        }
       Collections.reverse(list);
       for(Double item : list){
            System.out.println(item);
        }
//       Comparable c = new Comparable() {
//            @Override
//            public int compareTo(Object o) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//            return ;
//       }
    }
}
