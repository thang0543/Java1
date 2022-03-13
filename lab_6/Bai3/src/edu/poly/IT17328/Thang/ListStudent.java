
package edu.poly.IT17328.Thang;

import java.util.ArrayList;
import java.util.Scanner;


public class ListStudent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Student> listStudent = new ArrayList<>();
        
        for(int i = 0; i < 1; i++){
            Student st = new Student();
            st.InputStudent(s);
            listStudent.add(st);
        }
        
        for(Student st : listStudent){
            st.OutPutStudent();
        }
    }
}
