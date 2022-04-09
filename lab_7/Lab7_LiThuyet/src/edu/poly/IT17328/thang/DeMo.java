
package edu.poly.IT17328.thang;

import java.util.Scanner;


public class DeMo {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Staff sv = new Staff("thang", 10000);
        sv.output();
        
        Manage st2 = new Manage("hang",100000,100);
        st2.output();
        
        Manage st = new Manage();
        st.input(s);
        st.output();
    }
    
}
