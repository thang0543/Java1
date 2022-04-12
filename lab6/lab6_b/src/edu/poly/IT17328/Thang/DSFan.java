package edu.poly.IT17328.Thang;

import java.util.ArrayList;
import java.util.Scanner;

public class DSFan {

    Scanner s = new Scanner(System.in);

    private ArrayList<Fan> list = new ArrayList<>();

    public void init() {
        list.add(new Fan("nokia", Double.valueOf("100000"), Integer.valueOf("2021")));
        list.add(new Fan("nokia2", Double.valueOf("106000"), Integer.valueOf("2020")));
        list.add(new Fan("nokia3", Double.valueOf("107000"), Integer.valueOf("2000")));
        list.add(new Fan("nokia4", Double.valueOf("100070"), Integer.valueOf("2022")));

    }

    public void intputListFan() {
        String choose = "Y";
        do {
            Fan fn = new Fan();
            fn.input(s);
            list.add(fn);

            System.out.println("ban co muon tiep tuc nhap hay khong(y/n): ");
            choose = s.nextLine();
        } while (!choose.equalsIgnoreCase("n"));
    }

    public void outputListFan() {
        for (Fan fn : list) {
            fn.output();
        }
    }
    
    public void countFan(){
        int count = 0;
        for (Fan fn : list) {
           if(fn.getPrice() > 500){
               count ++;
            }
        }
        System.out.println("so quat gia lon hon 500 la: "+count);
    }
    
    public void findFan(){
        
         double min = list.get(0).getPrice();
          for (Fan fn : list) {
           if(fn.getPrice() < min){
               min = fn.getPrice();
            }
        }
           for (Fan fn1 : list) {
           if(fn1.getPrice() == min){
              System.out.println("thong tin quat co gia tri nho nhat la: ");
               fn1.output();
            }
        }
//          list.sort((a,b)->{
//            Double o1 = a.getPrice();
//            Double o2 = b.getPrice();
//            
//           return  o1.compareTo(o2);
//          });
//          
//          for (Fan fn : list) {
//           
//              System.out.println("thong tin quat co gia tri nho nhat la: ");
//               fn.output();
//               break;
//            }
    }
    
    
}
