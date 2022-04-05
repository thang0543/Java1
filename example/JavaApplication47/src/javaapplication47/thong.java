
package javaapplication47;

import java.util.Scanner;



public class thong {
    private String name;
    private int vong1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVong1() {
        return vong1;
    }

    public void setVong1(int vong1) {
        this.vong1 = vong1;
    }

    public thong() {
    }
   
    public void input(Scanner s ){
        System.out.println("nhap ten: ");
        name = s.nextLine();
        System.out.println("nhap 1: ");
        vong1 = Integer.parseInt(s.nextLine());
    }

    @Override
    public String toString() {
        return "thong{" + "name=" + name + ", vong1=" + vong1 + '}';
    }
    
    
    
}
