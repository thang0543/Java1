
package poly2;

import java.util.Scanner;


public class Student {
    private String name;
    private double  poin;

    public Student() {
    }

    public Student(String name, double poin) {
        this.name = name;
        this.poin = poin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPoin() {
        return poin;
    }

    public void setPoin(double poin) {
        this.poin = poin;
    }
    
    public void input(Scanner s ){
        System.out.println(" nhap ten : ");
        name = s.nextLine();
        System.out.println("nhap diem: ");
        poin = Double.parseDouble(s.nextLine());
    }

   
    public void output(){
        System.out.println("name=" + name + ", poin=" + poin);
    }
}
