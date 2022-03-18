/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Bai2 {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int x;
        System.out.println("nhap so phan tu: ");
        x = Integer.parseInt(s.nextLine());
        int[] arr = new int[x];
        
        for(int i = 0; i < x; i++){
            System.out.println("nhap phan tu "+i);
            arr[i] = Integer.parseInt(s.nextLine());
        }
        
//        for(int i = 0; i < arr.length ; i++){
//             System.out.println("Day phan tu "+arr[i]);
//        }
//        
//        for(int n : arr){
//            System.out.println("Day phan tu "+n);
//        }
        // sap giam 
//        int tmp;
//        for(int i = 0; i < x -1 ; i++){
//            for(int j = i+1 ;j < x;j++){
//                if(arr[i] < arr[j]){
//                     tmp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = tmp;
//                }
//            }
//        }
//        
//         System.out.print("day phan tu sau khi sap xep la: ");
//        for(int n : arr){
//            System.out.println("Day phan tu "+n);
//        }
        
      // sap tang c1
//       int tmp;
//        for(int i = 0; i < arr.length -1 ; i++){
//            for(int j = i+1 ;j < arr.length;j++){
//                if(arr[i] > arr[j]){
//                     tmp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = tmp;
//                }
//            }
//        }
//        
//        System.out.print("day phan tu sau khi sap xep la: ");
//        for(int n : arr){
//            System.out.print(n+"\t");
//        }
        //c2
        Arrays.sort(arr);
        System.out.println("xuat mang tang" + Arrays.toString(arr));
        //tông cac phan tub mang
        //tinh trung binh cac phan tu
        int sum = 0;
        for(int i= 0; i < arr.length; i++){
            sum += arr[i];
        }
        double avg = (double)sum / arr.length;
        
        System.out.println("tong cac phan tu la: "+sum);
        System.out.println("gia tri trung binh cac phan tu la: "+avg );
        
    }
}
