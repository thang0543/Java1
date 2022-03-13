
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class Product {

    private String name;
    private String manufacturer;
    private double price;

    public Product() {
    }

    public Product(String name, String manufacturer, double price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void InputProduct(Scanner s){
        System.out.print("nhap ten san pham: ");
        name = s.nextLine();
        System.out.print("nhap gia san pham: ");
        price = Double.parseDouble(s.nextLine());
        System.out.print("nhap hang: ");
        manufacturer = s.nextLine();
    }
    
    public void OutPutProduct(){
        System.out.println("ten san pham: "+name+"\tgia: " +price+"\thang: "+manufacturer);   
    }
    
}
