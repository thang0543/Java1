
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class Bai1 {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        rectangular rt = new rectangular();
        square sq = new square();
        rt.Input(s);
        sq.InPut(s);
        rt.outPut();
        sq.outPut();
    }
    
}
