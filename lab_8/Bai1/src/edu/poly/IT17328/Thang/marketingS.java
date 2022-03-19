
package edu.poly.IT17328.Thang;


public class marketingS extends Staff{
    private double rose;
    private double sales;

    public marketingS() {
    }

    public marketingS(double rose, double sales, String name, String id, double salary) {
        super(name, id, salary);
        this.rose = rose;
        this.sales = sales;
    }

    public double getRose() {
        return rose;
    }

    public void setRose(double rose) {
        this.rose = rose;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
    
}
