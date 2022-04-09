
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class marketingStaff extends staff{
    private double sales;
    private double rose;

    public marketingStaff() {
    }

    public marketingStaff(double sales, double rose) {
        this.sales = sales;
        this.rose = rose;
    }

    public marketingStaff(double sales, double rose, String userName, String id, double salary, String position) {
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
        System.out.println("doanh so: "+sales+"\t hoa hong: "+rose );
    }

    @Override
    public double getIncome() {
       return getSalary()+getSales()*getRose()/100;
    }

   

 

  
   
    
    
}
