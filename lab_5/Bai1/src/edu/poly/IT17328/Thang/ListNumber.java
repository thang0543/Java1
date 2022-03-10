
package edu.poly.IT17328.Thang;

import java.util.ArrayList;
import java.util.Scanner;


public class ListNumber {

  private  ArrayList<Double> list = new ArrayList<>();
    public void input(){
        Scanner s = new Scanner(System.in);
        String choose = "y";
       
        do {            
            System.out.println("nhap so thuc: ");
            Double x = Double.parseDouble(s.nextLine());
            list.add(x);
            System.out.println("tiep tuc hay khong(y/n): ");
            choose = s.nextLine();
        } while (choose.equalsIgnoreCase("y"));
        //        while(true){
//            System.out.println("nhap so thuc: ");
//            Double x = Double.parseDouble(s.nextLine());
//            list.add(x);
//            System.out.println("tiep tuc hay khong(y/n): ");
//            if(s.nextLine().equals("n")){
//                break;
//            }
//        }
    }
    
    public void showList(){
        System.out.println("danh sach ca so vua nhap la : ");
        for(Double a : list){
             System.out.printf("%.2f \t",a);
        }
    }
    public void SumList(){
        double sum = 0;
        for(Double a : list){
           sum += a;
        }
        System.out.printf("\n tông ca so vua nhap la: %.2f",sum);
    }
}
        
            
    

