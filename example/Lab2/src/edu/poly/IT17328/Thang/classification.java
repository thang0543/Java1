
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class classification {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Double poin;
            System.out.println("nhap diem: ");
            poin = Double.parseDouble(s.nextLine());
        
       if(poin < 5 && poin >=0){
              System.out.println("yeu");
          }else if(poin >= 5 && poin <= 6.5){
              System.out.println("TB");
          }else if(poin >= 6.5 && poin <= 7.5){
             System.out.println("kha");
          }else if(poin >= 7.5 && poin <= 9){
              System.out.println("gioi");
          }else if(poin >= 9 && poin <=10){
             System.out.println("xuat sac");
          }else{
              System.out.println("khong hop le");
          }
       String xepLoai = poin  < 5 ?" truot":"dat";
    }
}
