
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class Main {

    public static   Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int choose;
        ListStudent listName = new ListStudent();
        do{
            menu();
        System.out.println("nhap chuc nang: ");
        choose = Integer.parseInt(s.nextLine());
        switch (choose) {
            case 1:
                listName.InPut(s);
                break;
            case 2:
                listName.OutPut();
                break;
            case 3:
                listName.OutPutRandom();
                break;
            case 4:
                listName.OutPutSortName();
                break;
            case 5:
                listName.findAndDelete(s);
                break;
            case 6:
                System.exit(0);
                break;
            default:
                throw new AssertionError();
        }
        }while (true);
    }
    public static void menu(){
        System.out.println("----------------------------Menu-------------------");
            System.out.println("1: nhap danh sach ho ten");
            System.out.println("2: xuat danh sach vua nhap");
            System.out.println("3: Xuat danh sach dau nhien");
            System.out.println("4: sap xep giảm dan va xuat danh sach");
            System.out.println("5: tim va xoa ho ten nhap tu ban phim");
            System.out.println("6: thoat");
    }

}
