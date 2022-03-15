package edu.poly.IT17328.Thang;

import java.util.Scanner;

public class main {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            switch (menu()) {
                case 1:
                     System.out.println("ban da chon giai phuong trinh bac nhat");
                    giaiPhuongTrinhBacNhat();
                    break;
                case 2:
                    System.out.println("ban da chon nhap tuoi");
                    inputAge();
                    break;
                case 3:
                    System.out.println("ban da chon xep loai");
                    classiFication();
                    break;
                case 4:
                     System.out.println("ban da chon tim max");
                    findMax();
                    break;
                case 5:
                    System.out.println("ban da chon tim so ngay trong thang");
                    mothAndYear();
                    break;
                    case 6:
                        System.out.println("ban da chon nhap 1 thang");
                        IntegerNumber();
                    break;
                case 7:
                      System.out.println("7ban da chon thoat");
                    System.exit(0);
                    break;
                default:
                    System.out.print("lua chon cua ban khong ton tai");
            }
        } while (true);
    }

    public static int menu() {
        int choose;
        System.out.println("\n-------------------Menu---------------------------");
        System.out.println("1: giai phuong trinh bac nhat");
        System.out.println("2: nhap tuoi");
        System.out.println("3: xep loai");
        System.out.println("4: tim max");
        System.out.println("5: tim so ngay trong thang");
        System.out.println("6: nhap 1 thang");
        System.out.println("7: thoat");
        System.out.println("nhap lua chon: ");
        choose = Integer.parseInt(s.nextLine());
        return choose;
    }

    private static void findMax() {
        System.out.println("tim so lon nhat trong 2 so:");
        int a, b;
        System.out.println("nhap a: ");
        a = Integer.parseInt(s.nextLine());
        System.out.println("nhap b: ");
        b = Integer.parseInt(s.nextLine());

        int maxTwo = a > b ? a : b;
        System.out.println("so lon nhat la: " + maxTwo);

        System.out.println("tim so lon nhat trong 3 so:");
        int c, d, e;
        System.out.println("nhap c: ");
        c = Integer.parseInt(s.nextLine());
        System.out.println("nhap d: ");
        d = Integer.parseInt(s.nextLine());
        System.out.println("nhap e: ");
        e = Integer.parseInt(s.nextLine());

        int maxThere = c > d ? c : (d > e ? d : e);
        System.out.println("so lon nhat la: " + maxThere);
    }

    private static void giaiPhuongTrinhBacNhat() {
        System.out.println("nhap ax: ");
        long a = Long.parseLong(s.nextLine());
        System.out.println("nhap b: ");
        long b = Long.parseLong(s.nextLine());
        double x = (double) -b / a;
        System.out.println("gia tri can tim la: " + x);
    }

    private static void inputAge() {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("nhap tuoi: ");
            byte age = Byte.parseByte(s.next());
        } catch (NumberFormatException e) {
            System.out.println("loi");
        }
    }

    private static void classiFication() {
        Double poin;
        System.out.println("nhap diem: ");
        poin = Double.parseDouble(s.nextLine());

        if (poin < 5 && poin >= 0) {
            System.out.println("yeu");
        } else if (poin >= 5 && poin <= 6.5) {
            System.out.println("TB");
        } else if (poin >= 6.5 && poin <= 7.5) {
            System.out.println("kha");
        } else if (poin >= 7.5 && poin <= 9) {
            System.out.println("gioi");
        } else if (poin >= 9 && poin <= 10) {
            System.out.println("xuat sac");
        } else {
            System.out.println("khong hop le");
        }
        String xepLoai = poin < 5 ? " truot" : "dat";
    }

    private static void mothAndYear() {
        
         int moth;
        do {            
            System.out.println("nhap 1 thang: ");
             moth = Integer.parseInt(s.nextLine());
        } while(moth < 1 || moth > 12);
       

        switch (moth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("co 31 ngay ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("co 31 ngay ");
                break;
            case 2:
                System.out.println("nhap nam: ");
                int year = Integer.parseInt(s.nextLine());
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("co 29 ngay");
                } else {
                    System.out.println("co 28 ngay");
                }
                break;
            default:
                System.out.println("khong hop le");
        }
    }

    private static void IntegerNumber() {
        int moth;
        do {            
            System.out.println("nhap 1 thang: ");
             moth = Integer.parseInt(s.nextLine());
        } while(moth < 1 || moth > 12);
    }
}
