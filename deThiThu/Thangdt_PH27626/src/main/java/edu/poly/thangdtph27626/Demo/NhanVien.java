
package edu.poly.thangdtph27626.Demo;

import java.util.Scanner;


public class NhanVien {
    private String id;
    private String name;
    private double salary;
    private int yearBirth;

    public NhanVien() {
    }

    public NhanVien(String id, String name, double salary, int yearBirth) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.yearBirth = yearBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    
   
    
    public void input(Scanner s){
        System.out.println("nhap ma nhan vien: ");
        id = s.nextLine();
        System.out.println("nhap ten nhan vien: ");
        name = s.nextLine();
        System.out.println("nhap luong: ");
        salary = Double.parseDouble(s.nextLine());
        System.out.println("nhap nam sinh: ");
        yearBirth = Integer.parseInt(s.nextLine());
    }
    
    public String getTrangThai(){
        if(salary > 5000){
            return "tot";
        }else{
            return "binh thuong";
        }
    }
    
    @Override
    public String toString() {
        return "NhanVien{" + "id=" + id + ", name=" + name + ", salary=" + salary + ", yearBirth=" + yearBirth + ", trang thai: "+getTrangThai()+'}';
    }
    public void inThongTin(){
        System.out.println(toString());
    }
    
    public int age(){
        return 2021 - yearBirth;
    }
}
