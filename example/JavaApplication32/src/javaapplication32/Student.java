package javaapplication32;
// duong dan vao thu muc 

import java.util.Scanner;

public class Student {

    public String name;
    public double poin;

    public void input(Scanner s) {
        System.out.println("nhap ten sinh vien: ");
        name = s.nextLine();
        System.out.println("nhap diem: ");
        poin = Double.parseDouble(s.nextLine());
    }
    //nap chong phuong thuc (St + ctrl pase)
    public Student(String name, double poin) {
        this.name = name;
        this.poin = poin;
        //  thuoc tính  biến cục bộ
    }

    public Student() {
    }
    
    
    
    

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", price=" + poin + '}';
    }
    //nap chong phuong thuc 
    public void xeploai(){
        
    }
     public void xeploai(double  poin){
        
    }
    
}
