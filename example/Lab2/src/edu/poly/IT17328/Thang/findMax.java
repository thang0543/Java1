
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class findMax {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         System.out.println("tim so lon nhat trong 2 so:");
         int a,b;
            System.out.println("nhap a: ");
            a = Integer.parseInt(s.nextLine());
            System.out.println("nhap b: ");
            b = Integer.parseInt(s.nextLine());

       int maxTwo = a > b ? a : b;
        System.out.println("so lon nhat la: "+maxTwo);
        
         System.out.println("tim so lon nhat trong 3 so:");
         int c,d,e;
            System.out.println("nhap c: ");
            c = Integer.parseInt(s.nextLine());
            System.out.println("nhap d: ");
            d = Integer.parseInt(s.nextLine());
            System.out.println("nhap e: ");
            e = Integer.parseInt(s.nextLine());

       int maxThere = c > d ? c : (d > e ? d : e);
        System.out.println("so lon nhat la: "+maxThere);
    }
}
