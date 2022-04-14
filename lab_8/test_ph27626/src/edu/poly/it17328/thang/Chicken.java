
package edu.poly.it17328.thang;

import java.util.Scanner;


public class Chicken {
    private String name;
    private String color;
    private int price;

    public Chicken() {
    }

    public Chicken(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chicken{" + "name=" + name + ", color=" + color + ", price=" + price + '}';
    }
    
   
    public void input(Scanner s){
        System.out.println("nhap ten: ");
        name = s.nextLine();
        System.out.println("nhap mau: ");
        color = s.nextLine();
        System.out.println("nhap gia: ");
        price = Integer.parseInt(s.nextLine());
    }
    public void inThongTin(){
        System.out.println(toString());
    }
    
}
