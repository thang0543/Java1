
package edu.poly.IT17328.Thang;

import static edu.poly.IT17328.Thang.main.s;
import java.util.Scanner;


public class mothAndYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //in ra so ngay trong thang 
        //thang 2 nam thuan va nam khong nhuan 
//        System.out.println("nhap thang: ");
//        int moth = Integer.parseInt(s.nextLine());
         int moth;
        do {            
            System.out.println("nhap 1 thang: ");
             moth = Integer.parseInt(s.nextLine());
        } while(moth < 1 || moth > 12);
        switch (moth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 13:
                System.out.println("co 31 ngay ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("co 31 ngay ");
                break;
            case 2:
                System.out.println("nhap nam: ");
             int year = Integer.parseInt(s.nextLine());
             if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                 System.out.println("co 29 ngay");
             }else{
                 System.out.println("co 28 ngay");
             }
             break;
            default:
                System.out.println("khong hop le");
        }
    }
}
