
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class Staff {
    private String name;
    private String id;
    private double salary; 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Staff(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Staff() {
    }
    
    public void inputStaff(Scanner s){
        System.out.print("nhap ma nhan vien: ");
        id = s.nextLine();
        System.out.print("nhap ten nhan vien: ");
        name = s.next();
        System.out.print("nhap luong cua nhan vien: ");
        salary = Double.parseDouble(s.nextLine());
    }
    
    public void outputStaff(){
        System.out.print("ma: "+id);
        System.out.print("\t ho va ten: "+name);
        System.out.println("\t luong: "+salary);
    }
}
