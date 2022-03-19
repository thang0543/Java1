package edu.poly.IT17328.Thang;


public class manager extends Staff{
      private double responsibleWage;

    public manager() {
    }

    public manager(double responsibleWage, String name, String id, double salary) {
        super(name, id, salary);
        this.responsibleWage = responsibleWage;
    }
      
    
}
