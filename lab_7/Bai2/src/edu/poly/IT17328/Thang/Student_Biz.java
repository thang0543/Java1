
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class Student_Biz extends ListStudent{

    private double marketing,sales;

    public Student_Biz() {
    }

    public Student_Biz(double marketing, double sales, String name, String branch) {
        super(name, branch);
        this.marketing = marketing;
        this.sales = sales;
    }

    public Student_Biz(double marketing, double sales) {
        this.marketing = marketing;
        this.sales = sales;
    }

    public double getMarketing() {
        return marketing;
    }

    public void setMarketing(double marketing) {
        this.marketing = marketing;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
    
    
    @Override
    public Double poin() {
        return (marketing*2 + sales)/3;
    }
    
   
}
