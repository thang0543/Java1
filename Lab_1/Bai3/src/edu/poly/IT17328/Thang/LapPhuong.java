
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class LapPhuong {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("nhap canh cua khoi lap phuong: ");
        Double edge = s.nextDouble();
        Double volume = Math.pow(edge, 3);
        System.out.printf(" the tich khoi lap phuong la: %.2f", volume);
    }
    
}
