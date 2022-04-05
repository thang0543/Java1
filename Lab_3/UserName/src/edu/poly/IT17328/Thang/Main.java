
package edu.poly.IT17328.Thang;

import java.util.Scanner;


public class Main {

   public static String getLove(byte age){
       
       String text = "";
       
       if(age < 18 && age >=0){
           text = " No love";
       }else if(age >= 18 && age <= 30){
           text = " good love";
       }else{
           text = "No,never";
       }
       return text;
   }
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       byte tmpAge;
       String tmpName;
       
       String name[] = {"phuong","mai","hang","phong","lam"};
       byte age[] = {14,19,20,21,44 };
       
       for(int i = 0 ; i< name.length; i++){
           System.out.printf(" %s %d  \n",name[i],age[i]);
       }
       
       for(int i = 0; i < age.length -1; i++){
           for(int j = i + 1; j < age.length;j++){
               if(age[i] < age[j]){
                   tmpAge = age[i];
                   age[i] = age[j];
                   age[j] = tmpAge;
                   
                   tmpName = name[i];
                   name[i] = name[j];
                   name[j] = tmpName;
               }
           }
        }
        System.out.println("");
        System.out.println("mang sau khi sap xep: ");
       for(int i = 0 ; i< name.length; i++){
           System.out.printf(" %s %d  \n",name[i],age[i]);
       }
       
       System.out.println("");
        System.out.println("mang tuoi la: ");
       for(byte n : age){
           System.out.print(" "+n);
       }
       
       System.out.println("");
        System.out.println("\n thong tin:  ");
       for(int i = 0 ; i< name.length; i++){
           System.out.printf(" %s %d %s \n",name[i],age[i],getLove(age[i]));
       }
    }
       
    
}
