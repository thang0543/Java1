
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class Name {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("vui long nhap ten: ");
        String name = s.nextLine();

        String surname = name.substring(0,name.indexOf(" ")).toUpperCase();
        String lastName = name.substring(name.lastIndexOf(" "),name.length()).trim().toUpperCase();
        String middleName = name.substring(name.indexOf(" "), name.lastIndexOf(" ")).trim();

        System.out.print("ho va ten cua ban la: "+surname+" "+middleName+" " +lastName);
    }
    
}
