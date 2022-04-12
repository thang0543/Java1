package edu.poly.it17328.thang;

import java.util.Scanner;

public class Main {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        QLChicken ql = new QLChicken();
        
        
        do {
            switch (menu()) {
                case 1:
                    System.out.println("ban da chon nhap  danh sach");
                    ql.inputChicken(s);
                    break;
                case 2:
                    System.out.println("ban da chon in  danh sach");
                    ql.inThongTin();
                    break;
                case 3:
                    System.out.println("ban da chon in cac phan tu theo khoang nguoi dung nhap");
                    ql.findMinAndMax(s);
                    break;
                case 4:
                    System.out.println("ban da chon sap xep phan tu tang dan theo price");
                    ql.sortPrice();
                    break;
                case 5:
                    System.out.println("ban da chon gia trung binh ");
                    System.out.println("gia trung binh la: " + ql.AVGPrice());
                    break;
                case 0:
                    System.exit(0);
                    break;
                case 6:
                     System.out.println("ban da chon khoi tao");
                     ql.init();
                    break;
                case 7:
                     System.out.println("ban da chon ke thua");
                     LittteChicken litte = new LittteChicken(10, "mg", "xam", 100);
                     litte.inThongTin();
                    break;
                default:
                    throw new AssertionError();
            }
        } while (true);
    }

    private static int menu() {
        int choose;
        System.out.println("-------------menu------------------------");
        System.out.println("1: nhap  danh sach");
        System.out.println("2: xuat danh sach");
        System.out.println("3: in cac phan tu theo khoang nguoi dung nhap");
        System.out.println("4: sap xep phan tu tang dan theo price");
        System.out.println("5: gia trung binh ");
        System.out.println("0: thoat");
        System.out.println("6: them thong tin mat dinh ");
        System.out.println("7: ke thua ");
        System.out.println("nhap lua chon: ");
        choose = Integer.parseInt(s.nextLine());
        return choose;
    }

}
