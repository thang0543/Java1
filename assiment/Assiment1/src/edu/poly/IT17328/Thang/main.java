package edu.poly.IT17328.Thang;

import java.util.Scanner;

public class main {
    
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        do {            
            switch (menu()) {
                case 1:
                    System.out.println("Ban da chon Nhap danh sach nhan vien  ");
                    break;
                case 2:
                    System.out.println("Ban da chon Xuat danh sach nhan vien  ");
                    break;
                case 3:
                    System.out.println("Ban da chon Tim va hien thi nhan vien theo ma  ");
                    break;
                case 4:
                    System.out.println("Ban da chon Xoa nhan vien theo ma ");
                    break;
                case 5:
                     System.out.println("Ban da chon Cap nhat nhan vien theo ma ");
                    break;
                case 6:
                     System.out.println("Ban da chon Tim cac nhan vien nhap theo khoang luong  ");
                    break;
                case 7:
                     System.out.println("Ban da chon Sap xep nhan vien theo ho ten ");
                    break;
                case 8:
                    System.out.println("Ban da chon Sap xep nhan vien theo thu nhap  ");
                    break;
                case 9:
                    System.out.println("Ban da chon Top 5 nhan vien thu nhap cao nhat ");
                    break;
                case 10:
                    System.out.println("Ban da chon thoat");
                    System.exit(0);
                    break;
               
                default:
                    System.out.println("lua chon cua ban khong ton tai");
            }
        } while (true);
    }

    public static int menu() {
        int choose;
        
        System.out.println("\n--------------------menu---------------------");
        System.out.println("1: Nhap danh sach nhan vien  ");
        System.out.println("2: Xuat danh sach nhan vien  ");
        System.out.println("3: Tim va hien thi nhan vien theo ma  ");
        System.out.println("4: Xoa nhan vien theo ma ");
        System.out.println("5: Cap nhat nhan vien theo ma ");
        System.out.println("6: Tim cac nhan vien nhap theo khoang luong  ");
        System.out.println("7: Sap xep nhan vien theo ho ten ");
        System.out.println("8: Sap xep nhan vien theo thu nhap  ");
        System.out.println("9: Top 5 nhan vien thu nhap cao nhat ");
        System.out.println("10: Exit ");
        System.out.print("Nhap lua chon cua ban: ");
        choose = Integer.parseInt(s.nextLine());
        
        return choose;
    }
    
}
