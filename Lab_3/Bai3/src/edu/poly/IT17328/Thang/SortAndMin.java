
package edu.poly.IT17328.Thang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class SortAndMin {

    
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("nhap so luong cac nguyen to: ");
        int number = s.nextInt();
       int List[] = new int[number];
       int Sum = 0,Count = 0,AVG = 0,min = List[0];
       for(int i = 0;i < number; i++){
           System.out.printf("A[%d] = ",i);
           List[i] = s.nextInt();
    }
       for(int i = 1; i < number; i++){
//           if(min > List[i]){
//               min = List[i];
//           }
        min = Math.min(min, List[i]);
       }
       for(int i=0;i < number; i++){
        if(List[i] % 3 == 0){
            Sum += List[i];
            Count++;
        }   
       }
       AVG = Sum/Count;
        System.out.println("mang phan tu: "+ Arrays.toString(List));
        System.out.println("Sap xep : ");
        Arrays.sort(List);
        System.out.println("mang phan tu: "+ Arrays.toString(List));
        System.out.println("Phan tu nho nhat la: "+ List[0]);
        System.out.printf("Trung binh cong cac phan tu chia het cho 3 la: "+AVG );
}
}
