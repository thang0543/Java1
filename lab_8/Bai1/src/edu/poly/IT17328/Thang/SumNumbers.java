package edu.poly.IT17328.Thang;

import java.util.Scanner;

public class SumNumbers {

    static Scanner s = new Scanner(System.in);

    

    public static int menu() {

        int choose;
        System.out.println("\n--------------------------menu------------------------");
        System.out.println("1: Tinh tong cac so");
        System.out.println("2: Tim min ");
        System.out.println("3: tim max");
        System.out.println("4: In ra ho ten ");
        System.out.println("5: thoat");
        System.out.print("nhap lua chon cua ban: ");
        choose = Integer.parseInt(s.nextLine());
        return choose;
    }

    public static void main(String[] args) {
        System.out.println("nhap so phan tu: ");
        int number = Integer.parseInt(s.nextLine());

        double a[] = new double[number];

        for (int i = 0; i < number; i++) {
            System.out.println("nhap gia tri: ");
            a[i] = Integer.parseInt(s.nextLine());
        }
        do {

            switch (menu()) {
                case 1:
                    double s = XFile.Sum(a);
                    System.out.print("tong cac so vua nhap la: " + s);

                    break;
                case 2:
                    double min =  XFile.MinElement(a);
                    System.out.println(min);
                    break;
                case 3:
                     double max =  XFile.MaxElement(a);
                    System.out.println(max);
                    break;
                case 4:
                    System.out.println("ten cau ban la: ");
                    String fullName =  XFile.toUpperFirstChar();
                    System.out.println(fullName);
                    break;
                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("lua chon cua ban  khong ton tai");
            }
        } while (true);
    }

}
