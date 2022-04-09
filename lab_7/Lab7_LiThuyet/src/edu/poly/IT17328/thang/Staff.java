
package edu.poly.IT17328.thang;

import java.util.Scanner;


public class Staff {
    private String name;
    private double Wage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return Wage;
    }

    public void setWage(double Wage) {
        this.Wage = Wage;
    }

    public Staff() {
    }

    public Staff(String name, double Wage) {
        this.name = name;
        this.Wage = Wage;
    }

    @Override
    public String toString() {
        return "Staff{" + "name=" + name + ", Wage=" + Wage + '}';
    }
    
    public void input(Scanner s ){
        System.out.print("\n nhap ten nhan vien: ");
        name = s.nextLine();
        System.out.print(" nhap luong: ");
        Wage  = Double.parseDouble(s.nextLine());
    }
    
    public void output(){
        System.out.printf("name: %-15s luong: %-10.0f \n" , name , Wage);
    }
}
