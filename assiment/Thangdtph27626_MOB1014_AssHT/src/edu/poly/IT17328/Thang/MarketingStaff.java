
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class MarketingStaff extends Staff{
    private double sales;
    private double rose;

    public MarketingStaff() {
    }

    public MarketingStaff(double sales, double rose) {
        this.sales = sales;
        this.rose = rose;
    }

    public MarketingStaff(double sales, double rose, String userName, String id, double salary, String position) {
        super(userName, id, salary, "tiep thi");
        this.sales = sales;
        this.rose = rose;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getRose() {
        return rose;
    }

    public void setRose(double rose) {
        this.rose = rose;
    }

   public void inputMarketingStaff(Scanner s){
       super.inputStaff(s);
       System.out.print("nhap doanh so ban: ");
       sales = Double.parseDouble(s.nextLine());
       System.out.print("nhap hoa hong: ");
       rose = Double.parseDouble(s.nextLine());
   }
    public void ouputMarketingStaff(){
        super.outputStaff();
        System.out.printf("doanh so: %-20.0f hoa hong: %-20.0f",sales,rose );
    }

    @Override
    public double getIncome() {
       return getSalary()+getSales()*getRose()/100;
    }

   

 

  
   
    
    
}
