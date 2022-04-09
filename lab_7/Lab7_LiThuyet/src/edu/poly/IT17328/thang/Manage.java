
package edu.poly.IT17328.thang;

import java.util.Scanner;


public class Manage extends Staff{
    private double  responsibleSalary;

    public Manage(double responsibleSalary) {
        this.responsibleSalary = responsibleSalary;
    }

    public Manage(String name, double Wage,double responsibleSalary) {
        super(name, Wage);
        this.responsibleSalary = responsibleSalary;
    }

    public Manage() {
    }

    public double getResponsibleSalary() {
        return responsibleSalary;
    }

    public void setResponsibleSalary(double responsibleSalary) {
        this.responsibleSalary = responsibleSalary;
    }

    @Override
    public void input(Scanner s) {
         super.input(s);
        System.out.print("nhap luong trach nghiem: ");
        responsibleSalary = Double.parseDouble(s.nextLine());
    }

    // ghi đè phương thức 
//    @Override
//    public void output() {
//        super.output();
//        System.out.printf("luong trach nghiem: %-10.0f",responsibleSalary);
//    }
    
    // nap chong phuong thuc 
    public final  void output() {
        super.output();
        System.out.printf("luong trach nghiem: %-10.0f",responsibleSalary);
    }
   
}
