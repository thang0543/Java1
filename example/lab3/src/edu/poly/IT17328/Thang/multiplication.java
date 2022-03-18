
package edu.poly.IT17328.Thang;


public class multiplication {

  
    public static void main(String[] args) {
        int mul;
       for(int i = 1; i <= 10; i++){
           for(int j = 1; j <= 10; j++){
               mul = i * j;
               System.out.printf("%d * %d = %d",i,j,mul);
               System.out.println("");
           }
           System.out.print("\n");
       }
    }
    
}
