
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class Bai1 {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("nhap ax: ");
        long a  = Long.parseLong(s.nextLine());
        System.out.println("nhap b: ");
        long b = Long.parseLong(s.nextLine());
        double x = (double)-b/a;
        System.out.println("gia tri can tim la: "+x);
        
    }
    
}
