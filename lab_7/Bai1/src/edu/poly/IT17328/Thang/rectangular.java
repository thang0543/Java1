
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class rectangular {
    Double width,height;

    public rectangular(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public rectangular() {
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    
    public Double getPerimeter(){
        return (height + width)*2;
    }
    public Double getAcreage(){
        return (height * width);
    }
    
    public void Input(Scanner s){
        System.out.println("nhap chieu dai: ");
        height = Double.parseDouble(s.nextLine());
        System.out.println("nhap chieu rong: ");
        width = Double.parseDouble(s.nextLine());
    }
    public void outPut(){
        System.out.printf("chieu dai: %f \t cheu rong: %f \t chu vi: %f \t Dien tich: %f",
                          height,width,getPerimeter(),getAcreage());
    }
}
