
package javaapplication32;

import java.util.Scanner;


public class main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
//        Student st = new Student();
        Student st2 = new Student("le van minh",9);
        st2.toString();
//        st.input(s);
//        st.toString();

        System.out.println("ten cua sinh vien: "+st2.name);
        st2.name = "Dương Tu Thắng";
        st2.poin = 10;
        st2.toString();
        
    }
}
