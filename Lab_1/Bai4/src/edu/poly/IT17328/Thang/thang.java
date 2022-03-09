
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class thang {

   
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.println("nhap ax^2: ");
           Double a = s.nextDouble();
        System.out.println("nhap bx: ");
           Double b = s.nextDouble();
        System.out.println("nhap c: ");
           Double c = s.nextDouble();
        
        Double Denta = Math.pow(b,2) - 4*a*c;
        System.out.printf("Denta: %.2f",Denta);
        System.out.printf("Căn bậc 2 của Denta la: %.2f",Math.sqrt(Denta));
    }
    
}
