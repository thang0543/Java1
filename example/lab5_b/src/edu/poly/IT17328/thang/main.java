package edu.poly.IT17328.thang;

import java.util.Scanner;

public class main {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        ListProduct qlnv = new ListProduct();

        do {
            menu();
            System.out.println("nhap lua chon: ");
            int choose = Integer.parseInt(s.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("ban da chon nhap");
                    qlnv.inputListProduct(s);
                    break;
                case 2:
                    System.out.println("ban da chon xuat");
                    qlnv.outputListProduct();
                    break;
                case 3:
                    System.out.println("ban da chon them san pham");
                    qlnv.initialization();
                    break;
                case 4:
                    System.out.println("ban da chon sap xep theo gia");
                    qlnv.Sortpoin();
                    break;
                case 5:
                    System.out.println("ban da chon thoat");
                    System.exit(0);
                    break;

                default:
                    System.out.println("muc ban chon khong co ");
            }

        } while (true);
    }

    public static void menu() {
        System.out.println("-------------------menu---------------------");
        System.out.println("1: nhap danh sach san pham");
        System.out.println("2: xuat danh sach san pham");
        System.out.println("3: khơi tao sach san pham");
        System.out.println("4: sap xep theo gia");
        System.out.println("5: thoat");
    }
}
