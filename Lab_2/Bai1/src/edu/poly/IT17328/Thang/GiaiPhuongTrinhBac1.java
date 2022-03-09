
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class GiaiPhuongTrinhBac1 {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         System.out.println("nhap ax: ");
           Double a = s.nextDouble();
        System.out.println("nhap b: ");
           Double b = s.nextDouble();
           
        if(a == 0){
             if( b == 0){
               System.out.println("Phuong trinh co vo so nghiem");
             }else{
                System.out.println("Phuong trinh vo nghiem");
             }
        }else{
            System.out.printf("Phuong trinh co nghiem x = %.2f", -b/a);
        }
    }
    
}
