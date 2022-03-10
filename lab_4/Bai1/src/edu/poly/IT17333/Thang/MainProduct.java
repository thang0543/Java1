package edu.poly.IT17333.Thang;

import java.util.Scanner;


public class MainProduct {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SanPham product1 = new SanPham();
        SanPham product2 = new SanPham();
        
        product1.Input(s);
        product2.Input(s);
        
        product1.Ouput();
        product2.Ouput();
        
    }
}
