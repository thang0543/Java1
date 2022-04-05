
package edu.poly.IT17328.Thang;

import java.util.Scanner;

public class Manager extends Staff{
    private double  responsibility;

    public Manager() {
    }

    public Manager(double responsibility) {
        this.responsibility = responsibility;
    }

    public Manager(double responsibility, String userName, String id, double salary, String position) {
        super(userName, id, salary, "truong phong");
        this.responsibility = responsibility;
    }
    
    public double getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(double responsibility) {
        this.responsibility = responsibility;
    }
    
    public void inputManager(Scanner s){
        super.inputStaff(s);
        System.out.print("nhap lương trach nhiem: ");
        responsibility = Double.parseDouble(s.nextLine());
    }
    
    public void outputManager(){
        super.outputStaff();
        System.out.printf("luong trach nghiem: %-20.0f",responsibility );
    }

    @Override
    public double getIncome() {
      return getSalary() +getResponsibility();
    }

    
}
