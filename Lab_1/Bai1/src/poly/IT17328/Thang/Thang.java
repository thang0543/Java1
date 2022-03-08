
package poly.IT17328.Thang;

import java.util.Scanner;

public class Thang {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("nhap ho va ten: ");
        String name = s.nextLine();
        System.out.println("nhap Diem: ");
        Double poin = s.nextDouble();
        System.out.println("");
        System.out.printf("Ho va Ten: %s \t| Diem: %.2f",name,poin);
    }
    
}
