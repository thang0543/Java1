package edu.poly.it17328.thang;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        listPhongHoc list = new listPhongHoc();
        int choose;
        do {            
            menu();
            System.out.print("nhap lua chon: ");
            choose = Integer.parseInt(s.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("ban da chon nhap danh sach phong hoc");
                    list.inputPhongHoc(s);
                    break;
                case 2:
                    System.out.println("ban da chon xuat danh sach phong hoc");
                    list.outputPhongHoc();
                    break;
                case 3:
                    System.out.println("ban da chon dem so luong phong hoc toa p");
                    list.countP();
                    break;
                case 4:
                    System.out.println("ban da chon xuat cac phong hoc tang 3");
                    list.outputListTang3();
                    break;
                case 5:
                    System.out.println("ban da chon sap xep phong hoc giam dan");
                    list.sort();
                    break;
                case 6:
                    System.out.println("ban da chon thoat");
                    System.exit(0);
                    break;
                case 7:
                     System.out.println("ban da chon them thong tin");
                   list.init();
                    break;
                     case 8:
                     System.out.println("ban da chon ke tua");
                     PhongNghiGiaoVien pv = new PhongNghiGiaoVien("java","p122", 3,"p");
                     pv.output();
                    break;
                default:
                    System.out.println("lua chon cua ban khong ton tai");
            }
        } while (true);
    }
    
    private static void menu() {
        System.out.println("--------------------menu---------------------------");
        System.out.println("1: nhap danh sach phong hoc");
        System.out.println("2: xuat danh sach phong hoc");
        System.out.println("3: dem so luong phong hoc toa p ");
        System.out.println("4: xuat cac phong hoc tang 3");
        System.out.println("5: sap xep phong hoc giam dan");
        System.out.println("6: exit");
        System.out.println("7: them thong tin");
        System.out.println("8: ke thua");
    }

  
    
}
