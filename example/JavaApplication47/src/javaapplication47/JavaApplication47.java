
package javaapplication47;

import java.util.ArrayList;
import java.util.Scanner;


public class JavaApplication47 {

  
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<thong> list = new ArrayList<>();
        
        for(int i=0; i<2; i++){
            thong tn = new thong(); 
           
            tn.input(s);
            list.add(tn);
        }
        
         for(thong t : list){
             System.out.println(t);
        }
         
         int max = 0;
         
         for(thong t : list){  
           if(max < t.getName().length()){
              
               max = t.getName().length();
           }
        }
         
       for(thong t : list){  
           if(max == t.getName().length()){
              
               System.out.println();
           }
        }
         
    }

   
    
}
