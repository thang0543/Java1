
package B2;


 abstract  public class Student {
    private String name;
    private double  poin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPoin() {
        return poin;
    }

    public void setPoin(double poin) {
        this.poin = poin;
    }

    public Student() {
    }

    public Student(String name, double poin) {
        this.name = name;
        this.poin = poin;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", poin=" + poin + '}';
    }
    
   abstract  public double getDiemTB();
    
}
