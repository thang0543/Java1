
package B2;


public class StudentIT extends Student{
    private double  java, css;

    @Override
    public double getDiemTB() {
        return (java+css)/2;
    }
    
    
}
