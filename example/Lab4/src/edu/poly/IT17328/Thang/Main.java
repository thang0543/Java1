
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Product pd = new Product();
        pd.input(s);
        pd.ouput();
        
        Product pd2 = new Product("nokia" ,10000, 2);
        
        pd2.toString();
        pd2.ouput();
        
    }
    
}
