
package edu.poly.it17328.thang;

import java.util.Scanner;


public class phongHoc {
    private String tenPhong;
    private int tang;
    private String nha;

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public String getNha() {
        return nha;
    }

    public void setNha(String nha) {
        this.nha = nha;
    }

    public phongHoc() {
    }

    public phongHoc(String tenPhong, int tang, String nha) {
        this.tenPhong = tenPhong;
        this.tang = tang;
        this.nha = nha;
    }

    @Override
    public String toString() {
        return "phongHoc{" + "tenPhong=" + tenPhong + ", tang=" + tang + ", nha=" + nha + '}';
    }
    
    public void input(Scanner s ){
        System.out.println("vui long nhap ten phong: ");
        tenPhong = s.nextLine();
        System.out.println("vui long nhap nha: ");
        nha = s.nextLine();
        System.out.println("vui long nhap tang: ");
        tang = Integer.parseInt(s.nextLine());
    }
    
    public  void output(){
        System.err.printf("ten phong: %-10s tang %-5d nha: %-20s \n",tenPhong,tang,nha);
    }
}
