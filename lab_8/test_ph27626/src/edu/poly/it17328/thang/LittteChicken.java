
package edu.poly.it17328.thang;

import java.util.Scanner;
import java.util.logging.Logger;


public class LittteChicken extends Chicken{
    private double weight;

    public LittteChicken(double weight) {
        this.weight = weight;
    }

    public LittteChicken(double weight, String name, String color, int price) {
        super(name, color, price);
        this.weight = weight;
    }

    public LittteChicken() {
    }

    
    
    
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("can nang: "+weight);
    }
   
    
    
}
