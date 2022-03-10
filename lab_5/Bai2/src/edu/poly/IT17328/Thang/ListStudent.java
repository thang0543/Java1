
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class ListStudent {
    String name;
    
    public void InPut(Scanner s){
        System.out.println("nhap ten Sinh vien: ");
        name = s.nextLine();
    }
    public void OutPut(Scanner s){
        System.out.println("ho va ten: %s"+name);
    }
}
