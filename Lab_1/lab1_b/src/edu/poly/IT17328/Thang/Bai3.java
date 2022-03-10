
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class Bai3 {

    
    public static void main(String[] args) {
        
        Double banKinh,ChuVi,DienTich;
        Scanner s = new Scanner(System.in);
        
        System.out.println("nhap ban kinh: ");
         banKinh = s.nextDouble();
       
        ChuVi = banKinh *2 * Math.PI;
        DienTich = Math.pow(banKinh, 2) * Math.PI;
        
        System.out.printf("chu vi %.2f \nDien tich %.2f",ChuVi,DienTich);
        
    }
    
}
