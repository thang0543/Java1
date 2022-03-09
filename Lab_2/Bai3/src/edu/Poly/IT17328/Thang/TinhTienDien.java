
package edu.Poly.IT17328.Thang;

import java.util.Scanner;


public class TinhTienDien {

   
    public static void main(String[] args) {
         int money;
        Scanner s = new Scanner(System.in);
        System.out.println("nhap so dien: ");
        int electricNumber = s.nextInt();
        if(electricNumber < 50){
            money = electricNumber*1000;
            System.out.printf("so tien phai tra la: %d",money);
        }else{
            money = 50*1000 + (electricNumber - 50)*1200;
            System.out.printf("so tien phai tra la: %d",money);
        }
    }
    
}
