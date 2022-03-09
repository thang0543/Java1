
package edu.poly.IT17328.thang;

import java.util.Scanner;


public class HinhChuNhat {

  
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("nhap chieu dai: ");
         Double hight = s.nextDouble();
        System.out.println("nhap chieu rong: ");
         Double width = s.nextDouble();
         Double rain = (hight + width) * 2;
         Double acreage = hight *width;
         Double min = Math.min(hight, width);
        System.out.println("");
        System.out.printf("Chu vi hinh chu nhat la: %.2f", rain);
        System.out.printf("Dien tich hinh chu nhat la: %.2f", acreage);
        System.out.printf("Canh nho nhat la: %.2f",min);
    }
    
}
