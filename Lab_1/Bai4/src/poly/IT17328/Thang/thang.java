
package poly.IT17328.Thang;

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
        Double x1 = (-b - Math.sqrt(Denta)) / 2*a;
        Double x2 = (-b + Math.sqrt(Denta)) / 2*a;
        if(Denta < 0){
            System.out.println("Phuong trinh vo  nghiem");
        }else if(Denta == 0){
            System.out.printf("Phong trinh co nghiem ghep: %f",-b/a);
        }else{
            System.out.printf("Phuong trinh co hai nghiem: %f %f ",x1,x2);
        }
    }
    
}
