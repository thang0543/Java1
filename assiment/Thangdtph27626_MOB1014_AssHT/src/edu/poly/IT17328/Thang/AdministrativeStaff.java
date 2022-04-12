
package edu.poly.IT17328.Thang;


public class AdministrativeStaff extends Staff{

   
    public AdministrativeStaff() {
    }

    public AdministrativeStaff(String userName, String id, double salary, String position) {
        super(userName, id, salary, "hanh chanh");
    }

    @Override
    public double getIncome() {
       return getSalary();
    }

    
    
}
