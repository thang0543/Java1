
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class Bai2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("nhap tuoi: ");
            byte age = Byte.parseByte(s.next());
        } catch (NumberFormatException e) {
            System.out.println("loi");
        }
    }
        
}
