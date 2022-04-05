
package poly2;

import java.util.Scanner;




public class ListStudent {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        QLNV qlnv = new QLNV();
       
        do {            
            menu();
            System.out.println("nhap lua chon: ");
            int choose = Integer.parseInt(s.nextLine());
            
            switch (choose) {
                case 1:
                    qlnv.inputListStudent(s);
                    break;
                    case 2:
                    qlnv.outputListStudent();
                    break;
                    case 3:
                    qlnv.initialization();
                    break;
                    case 4:
                    qlnv.SortName();
                    break;
                    case 5:
                    qlnv.SortPoin();
                    break;
                     case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("muc ban chon khong co ");
            }
            
        } while (true);
    }
    
    public static void menu() {
        System.out.println("-------------------menu---------------------");
        System.out.println("1: nhap danh sach sinh vien");
        System.out.println("2: xuat danh sach sinh vien");
        System.out.println("3: khơi tao sach sinh vien");
        System.out.println("4: sap xep theo ten");
        System.out.println("5: sap xep theo diem");
        System.out.println("6: thoat");
    }
    
}
