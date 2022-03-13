package edu.poly.IT17328.Thang;


import java.util.Scanner;

public class Main {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        ListStudent st = new ListStudent() {
            @Override
            public Double poin() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        st.menu();

    }

}
