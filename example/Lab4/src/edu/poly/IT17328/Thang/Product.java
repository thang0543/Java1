
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class Product {
    private String name;
    private double price;
    private int num;

    public Product() {
    }

    public Product(String name, double price, int num) {
        this.name = name;
        this.price = price;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public void input(Scanner s){
        System.out.print("nhap ten san pham: ");
        name = s.nextLine();
        System.out.println(" nhap gia san pham: ");
        price = Double.parseDouble(s.nextLine());
        System.out.println("nhap so luong: ");
        num = Integer.parseInt(s.nextLine());
    }

    
 
    
    
    
    public String getStatus(int so ){
        String text;
        
        if(so < 0){
            text = " khong hop le";
        }else if(so < 2){
           text = "it qua" ;
        }else if(so < 10){
            text = "Tam Duoc " ;
        }else{
            text = "quá tốt";
        }
        return text;
    }
            
      @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", num=" + num + ",status: "+getStatus(num)+'}';
    }
     
    public  void ouput(){
        System.out.println(name + "\t gia: "+price+"\t so luong: "+num+"\tstatus: "+getStatus(num));
    }
}
