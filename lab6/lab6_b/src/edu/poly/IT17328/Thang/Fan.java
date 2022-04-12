package edu.poly.IT17328.Thang;

import java.util.Scanner;

public class Fan {

    private String name;
    private double price;
    private int year;

    public Fan(String name, double price, int year) {
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public Fan() {
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Fan{" + "name=" + name + ", price=" + price + ", year=" + year + '}';
    }

    public void input(Scanner s) {
        System.out.print("nhap ten quat: ");
        name = s.nextLine();
        System.out.print("nhap gia tien: ");
        price = Double.parseDouble(s.nextLine());
        System.out.println("nhap năm san xuat: ");
        year = Integer.parseInt(s.nextLine());
    }

    public void output() {
        System.out.println("ten: " + name + "\t gia: " + price + "\t nam: " + year +"\t trang thai: "+getStatus());
    }

    public String getStatus() {
        if (year > 2020) {
            return "tot";
        } else {
            return "binh thuong";
        }
    }
}
