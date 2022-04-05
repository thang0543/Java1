
package javaapplication37;

import java.util.Scanner;


public class hi {
    private String name;
    private double poin;

    
    public hi(String name, double poin) {
        this.name = name;
        this.poin = poin;
    }

    public hi() {
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
    
    public void input(Scanner s){
        System.out.println("nhap ten: ");
        name = s.nextLine();
        System.out.println("nhap diem: ");
        poin = Double.parseDouble(s.nextLine());
    }
   
    
    @Override
    public String toString() {
        return "hi{" + "name=" + name + ", poin=" + poin + '}';
    }
    
    
}
