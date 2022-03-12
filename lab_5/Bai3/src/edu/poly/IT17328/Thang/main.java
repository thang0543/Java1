
package edu.poly.IT17328.Thang;

import java.util.ArrayList;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ListProduct list = new ListProduct();
        do {            
            menu();
            System.out.println("nhap lua chon: ");
            int choose = Integer.parseInt(s.nextLine());
            switch (choose) {
                case 1:
                    list.InPut(s);
                    break;
                case 2 :
                    list.OutPutSortPrice();
                    break;
                case 3 :
                    list.findAndDeteleProduc(s);
                    break;
                case 4 :
                    list.AVG_Price();
                    break;
                case 5 :
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        } while (true);
        
    }
    public static void menu(){
        System.out.println("------------------------Menu--------------------");
        System.out.println("1: nhap danh sach san pham");
        System.out.println("2: sap xep giam dan theo gia");
        System.out.println("3: xoa san pham");
        System.out.println("4: gia trung binh cua cac san pham");
        System.out.println("5: thoat");
    }
}
