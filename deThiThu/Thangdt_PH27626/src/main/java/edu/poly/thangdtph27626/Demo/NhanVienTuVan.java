
package edu.poly.thangdtph27626.Demo;

import java.util.Scanner;


public class NhanVienTuVan extends NhanVien{
    private String ngoaiNgu;

    public NhanVienTuVan(String ngoaiNgu) {
        this.ngoaiNgu = ngoaiNgu;
    }

    public NhanVienTuVan(String ngoaiNgu, String id, String name, double salary, int yearBirth) {
        super(id, name, salary, yearBirth);
        this.ngoaiNgu = ngoaiNgu;
    }

    public NhanVienTuVan() {
    }

    public String getNgoaiNgu() {
        return ngoaiNgu;
    }

    public void setNgoaiNgu(String ngoaiNgu) {
        this.ngoaiNgu = ngoaiNgu;
    }

    @Override
    public String getTrangThai() {
        return super.getTrangThai();
    }

    
    @Override
    public String toString() {
        
        return super.toString()+"NhanVienTuVan{" + "ngoaiNgu=" + ngoaiNgu + '}';
    }

    @Override
    public void input(Scanner s) {
        super.input(s); 
        System.out.println("nhap ten ngoai ngu: ");
        ngoaiNgu = s.nextLine();
    }

    
    
    
    
    public  final void  inThongTin() {
        super.inThongTin();
        System.out.println("ngoai ngu: "+ngoaiNgu);
    }

//    @Override
//    public void inThongTin() {
//        super.inThongTin();
//    }
}
