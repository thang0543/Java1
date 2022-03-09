
package edu.poly.edu.IT17328.Thang;

import java.util.Scanner;


public class Menu {

    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("----------------------MENU------------------------\n");
        System.out.println(" 1: Giai Phuong trinh bac 1 \n");
        System.out.println(" 2: Giai Phuong trinh bac 2 \n");
        System.out.println(" 3: Tinh tien dien\n");
        System.out.println(" 4: exit \n");
        System.out.print("nhap lua chon: ");
        int chosse = s.nextInt();
        switch (chosse) {
            case 1:
                GiaiPhuongTrinhBac1();
                break;
            case 2:
                GiaiPhuongTrinhBac2();
                break;
            case 3:
                TinhTienDien();
                break;
            case 4: 
                System.exit(0);
        }
    }

    private static void GiaiPhuongTrinhBac1() {
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

    private static void GiaiPhuongTrinhBac2() {
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

    private static void TinhTienDien() {
         int money;
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
