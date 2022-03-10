
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class listCoures {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;
        int semester;
        double price;
        
        
        System.out.println("nhap ky hoc: ");
        semester = s.nextInt();
        System.out.println("nhap gia tien: ");
        price = s.nextDouble();
        s.nextLine();
        System.out.println("nhap ten: ");
        name = s.nextLine();
        
        System.out.printf(" ten: %s ",name);
        System.out.printf("ky hoc: %d ",semester);
        System.out.printf("gia tien:%.2f",price);
        System.out.println("\tten: "+name);
        System.out.println("\tky hoc: "+semester);
        System.out.println("\tgia tien: "+price);
    }
}
