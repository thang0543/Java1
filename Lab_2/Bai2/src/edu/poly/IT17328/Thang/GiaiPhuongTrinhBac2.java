
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class GiaiPhuongTrinhBac2 {

   
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.println("nhap ax^2: ");
           Double a = s.nextDouble();
        System.out.println("nhap bx: ");
           Double b = s.nextDouble();
        System.out.println("nhap c: ");
           Double c = s.nextDouble();
        
        Double Denta = Math.pow(b,2) - 4*a*c;
        Double x1 = (-b - Math.sqrt(Denta)) / 2*a;
        Double x2 = (-b + Math.sqrt(Denta)) / 2*a;
       if(a == 0){
                if(b == 0){
                  if( c == 0){
                    System.out.println("Phuong trinh co vo so nghiem");
                  }else{
                     System.out.println("Phuong trinh vo nghiem");
                  }
             }else{
                 System.out.printf("Phuong trinh co nghiem x = %.2f", -c/b);
             }
       }else{
                if(Denta < 0){
                    System.out.println("Phuong trinh vo  nghiem");
                }else if(Denta == 0){
                    System.out.printf("Phong trinh co nghiem ghep: %f",-b/2*a);
                }else{
                    System.out.printf("Phuong trinh co hai nghiem: %f %f ",x1,x2);
                }
       }
    }
    
}
