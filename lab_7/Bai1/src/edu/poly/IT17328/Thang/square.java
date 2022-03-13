
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class square extends rectangular{

    double edge;
    
    public square() {
        
    }
    
    public square(Double edge) {
        super(edge,edge);
    }
    
   
    public void InPut(Scanner s){
        System.out.println("nhap canh: ");
        edge = Double.parseDouble(s.nextLine());
        super.setWidth(edge);
        super.setHeight(edge);
    }
    @Override
    public void outPut(){
         System.out.printf("\ncanh: %f \t chu vi: %f \t Dien tich: %f",
                          this.width,this.getPerimeter(),this.getAcreage());
    }
}
