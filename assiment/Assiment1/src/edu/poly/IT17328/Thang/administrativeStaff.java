
package edu.poly.IT17328.Thang;


public class administrativeStaff extends staff{

   
    public administrativeStaff() {
    }

    public administrativeStaff(String userName, String id, double salary, String position) {
        super(userName, id, salary, "hanh chanh");
    }

    @Override
    public double getIncome() {
       return getSalary();
    }

    
    
}
