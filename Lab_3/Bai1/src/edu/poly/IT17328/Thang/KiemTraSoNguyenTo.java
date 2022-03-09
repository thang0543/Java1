
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class KiemTraSoNguyenTo {

  
    public static void main(String[] args) {
       
       Scanner s = new Scanner(System.in);
        System.out.println("nhap 1 so: ");
        int elementNumber = s.nextInt();
        
        if(isflag(elementNumber)){
            System.out.printf("%d La so nguyen to ",elementNumber);
        }else{
            System.out.printf("%d La khong phai so nguyen to ",elementNumber);
        }
        
    }
    
    public static boolean isflag(int n){
        if(n < 2){
            return false;
        }
            for(int i=2 ; i < Math.sqrt(i); i++){
                if(n % i ==0){
                    return false;
                }
            }
        return true;
    }
}
