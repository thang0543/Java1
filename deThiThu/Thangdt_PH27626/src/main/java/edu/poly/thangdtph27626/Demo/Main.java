
package edu.poly.thangdtph27626.Demo;

import java.util.Scanner;


public class Main {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        QLNV list = new QLNV();
        do {            
            switch (menu()) {
                case 1:
                    list.init();
                    break;
                 case 2:
                    list.input(s);
                    break;
                  case 3:
                    list.ouput();
                    break;
                   case 4:
                    list.outputFindName(s);
                    break;
                    case 5:
                        System.out.println("ke thua");
                        NhanVienTuVan nvtv = new NhanVienTuVan("anh", "pj88", "hang", 1220, 1990);
                        nvtv.inThongTin();
                    break;
                     case 0:
                         System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        } while (true);
    }

    private static int menu() {
        System.out.println("----------------------menu-------------------");
        System.out.println("1: khoi tao");
        System.out.println("2: nhap danh sach nhan vien");
        System.out.println("4: xuat danh sach");
        System.out.println("5: xuat nhan vien co luong > 500");
        System.out.println("6: xuat nhan vien theo khoang luong");
        System.out.println("7: tim nhan vien theo ma");
        System.out.println("8: xuat danh sach nhan vien tu 18-30");
        System.out.println("9: dem nhan vien > 18");
        System.out.println("10: sap xep nhan vien theo ten giam dan");
        System.out.println("11: sap xep nhan vien theo luong giam dan");
        System.out.println("12: sap xep nhan vien theo tuoi tang dan");
        System.out.println("13: tim theo ma nv");
        System.out.println("14: tim theo ten nv");
        System.out.println("15: xuat danh sach nhan vien theo trang thai");
        System.out.println("16: xoa doi tuong");
        System.out.println("17: xuat danh sach nhan vien co tuoi la chan");
        System.out.println("18: xuat danh sach nhan vien co tuoi la le");
        System.out.println("19: xua danh sach co ten bat dau voi tu hoa chu cai ");
        System.out.println("0: thoat");
        System.out.println("nhap lua chon: ");
        int choose = Integer.parseInt(s.nextLine());
        return choose;
    }
}
