
package edu.poly.IT17328.thang;

import java.util.Scanner;

public class product {
    private String name;
    private double  poin;
    private String origin;

    public product() {
    }

    public product(String name, double poin, String origin) {
        this.name = name;
        this.poin = poin;
        this.origin = origin;
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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "product{" + "name=" + name + ", poin=" + poin + ", origin=" + origin + '}';
    }
    
     public void input(Scanner s ){
        System.out.println(" nhap ten san pham: ");
        name = s.nextLine();
        System.out.println("nhap gia: ");
        poin = Double.parseDouble(s.nextLine());
         System.out.println(" xuat xu: ");
        origin = s.nextLine();
    }

   
    public void output(){
        System.out.println("name=" + name + "\t  poin=" + poin + "\t origin=" + origin);
    }
}
