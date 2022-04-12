package edu.poly.IT17328.Thang;

import java.util.Scanner;

public class Demo {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        DSFan list = new DSFan();
        
        int choose;
        do {
            menu();
            System.out.println("nhap lua chon cua ban: ");
            choose = Integer.parseInt(s.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("ban da chon nhap thong tin quat: ");
                    list.intputListFan();
                    break;
                case 2:
                    System.out.println("ban da chon xuat thong tin quat: ");
                    list.outputListFan();
                    break;
                case 3:
                    System.out.println("ban da chon them thong tin quat co san: ");
                    list.init();
                    break;
                case 4:
                    System.out.println("ban da chon dem so quat lon hon 500: ");
                    list.countFan();
                    
                    break;
                case 5:
                    System.out.println("ban da chon xuat thong tin quat co gia tri nho nhat: ");
                    list.findFan();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("lua chon cua ban khong ton tai ");
            }
        } while (true);
    }

    public static void menu() {
        System.out.println("------------------------menu--------------------------");
        System.out.println("1: nhap danh sach quat");
        System.out.println("2: xuat danh sach quat");
        System.out.println("3: them san thong tin ");
        System.out.println("4: so quat co gia tri lon hon 500");
        System.out.println("5: thong tin quat co gia tien nho nhat");
        System.out.println("6: thoat");
    }
}
