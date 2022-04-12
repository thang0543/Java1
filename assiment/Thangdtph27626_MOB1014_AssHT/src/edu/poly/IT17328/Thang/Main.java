package edu.poly.IT17328.Thang;

import java.util.Scanner;

public class Main {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        listStaff list = new listStaff();
        do {
            switch (menu()) {
                case 1:
                    System.out.println("ban da chon Nhap danh sach nhan vien  ");
                    list.inputListStaff(s);
                    break;
                case 2:
                    if (list.checkInit()) {
                        System.out.println("vui long nhap du lieu");
                    } else {
                        System.out.println("Ban da chon Xuat danh sach nhan vien  ");
                        list.outputListStaff();
                    }

                    break;
                case 3:
                    if (list.checkInit()) {
                        System.out.println("vui long nhap du lieu");
                    } else {
                        System.out.println("Ban da chon Tim va hien thi nhan vien theo ma  ");
                        list.findEmpolyeeId(s);
                    }

                    break;
                case 4:
                    if (list.checkInit()) {
                        System.out.println("vui long nhap du lieu");
                    } else {
                        System.out.println("Ban da chon Xoa nhan vien theo ma ");
                        list.deleteEmployeeId(s);
                    }

                    break;
                case 5:
                    if (list.checkInit()) {
                        System.out.println("vui long nhap du lieu");
                    } else {
                        System.out.println("Ban da chon Cap nhat nhan vien theo ma ");
                        list.updateEmployeeId(s);
                    }

                    break;
                case 6:
                    if (list.checkInit()) {
                        System.out.println("vui long nhap du lieu");
                    } else {
                        System.out.println("Ban da chon Tim cac nhan vien nhap theo khoang luong  ");
                        list.findEmpolyeeSalary(s);
                    }

                    break;
                case 7:
                    if (list.checkInit()) {
                        System.out.println("vui long nhap du lieu");
                    } else {
                        System.out.println("Ban da chon Sap xep nhan vien theo ho ten ");
                        list.sortUserName();
                    }

                    break;
                case 8:
                    if (list.checkInit()) {
                        System.out.println("vui long nhap du lieu");
                    } else {
                        System.out.println("Ban da chon Sap xep nhan vien theo thu nhap  ");
                        list.sortEmpolyeeIncome();
                    }

                    break;
                case 9:
                    if (list.checkInit()) {
                        System.out.println("vui long nhap du lieu");
                    } else {
                        System.out.println("Ban da chon Top 5 nhan vien thu nhap cao nhat ");
                        list.top5EmpolyeeIncome();
                    }

                    break;
                case 10:
                    System.out.println("Ban da chon them thong tin co san ");
                    list.init();
                    break;
                case 11:
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
        System.out.println("10: them thong tin co san");
        System.out.println("11: Exit ");
        System.out.print("Nhap lua chon cua ban: ");
        choose = Integer.parseInt(s.nextLine());

        return choose;
    }

}
