
package edu.poly.it17328.thang;

import java.util.Scanner;


public class PhongNghiGiaoVien extends phongHoc{
    private String boMon;

    public PhongNghiGiaoVien() {
    }

    public PhongNghiGiaoVien(String tenPhong, int tang, String nha) {
        super(tenPhong, tang, nha);
    }

    public PhongNghiGiaoVien(String boMon) {
        this.boMon = boMon;
    }

    public PhongNghiGiaoVien(String boMon, String tenPhong, int tang, String nha) {
        super(tenPhong, tang, nha);
        this.boMon = boMon;
    }

    @Override
    public void input(Scanner s) {
        super.input(s); 
        System.out.println("vui long nhap bo mon: ");
        boMon = s.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.printf("bo mon: %-10s \n",boMon);
    }
    
    
    
}
