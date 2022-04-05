
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public abstract class Staff {
    String userName;
    private String id;
    private double salary;
    private String position;

    public abstract double getIncome();
    public Staff() {
    }

    public Staff(String userName, String id, double salary, String position) {
        this.userName = userName;
        this.id = id;
        this.salary = salary;
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String typeStaff) {
        this.position = typeStaff;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void inputStaff(Scanner s){
        System.out.print("nhap ma nhan vien: ");
        id = s.nextLine();
        System.out.print("nhap ho ten nhan vien: ");
        userName = s.nextLine();
        System.out.print("nhap luong cua nhan vien: ");
        salary = Double.parseDouble(s.nextLine());
    }
    
    public void outputStaff(){
        System.out.printf("\n ma: %-18s  ten: %-18s luong: %-20.0f  chuc vu: %-19s  thu nhap: %-20.0f",id,userName,salary,position,getIncome());
    }

    @Override
    public String toString() {
        return "staff{" + "userName=" + userName + ", id=" + id + ", salary=" + salary + ", position=" + position + '}';
    }

   
    
}
