package edu.poly.IT17328.Thang;

import java.util.Scanner;

public class SumNumbers {

    static Scanner s = new Scanner(System.in);

    public static final double Sum(double... element) {
        double sum = 0;
        for (double sumElement : element) {
            sum += sumElement;
        }
        return sum;
    }

    public static final double MinElement(double... element) {
        double min = element[0];
        for (double index : element) {
            min = Math.min(index, min);
        }
        return min;
    }

    public static final double MaxElement(double... element) {
        double max = element[0];
        for (double index : element) {
            max = Math.max(index, max);
        }
        return max;
    }

    public static final String toUpperFirstChar() {
        System.out.println("nhap ho va ten: ");
        String name = s.nextLine();
        String[] word = name.split(" ");

        StringBuilder bd = new StringBuilder();
        for (int i = 0; i < word.length; i++) {
            String item = word[i];
            if (!item.equals("")) {
                String firstChair = item.substring(0, 1).toUpperCase();
                item = firstChair + item.substring(1);
                bd.append(item).append(" ");

            }
        }
        return bd.toString().trim();
    }

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

                    double s = Sum(a);
                    System.out.print("tong cac so vua nhap la: " + s);

                    break;
                case 2:

                    double min = MinElement(a);
                    System.out.println(min);
                    break;
                case 3:
                     double max = MaxElement(a);
                    System.out.println(max);
                    break;
                case 4:
                    String fullName = toUpperFirstChar();
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
