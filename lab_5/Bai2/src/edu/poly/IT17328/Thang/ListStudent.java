
package edu.poly.IT17328.Thang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class ListStudent {
    String choose = "y";
    
    private ArrayList<String> list = new ArrayList<>();
    public void InPut(Scanner s){
        
        do {            
            System.out.println("nhap ten Sinh vien: ");
                String name = s.nextLine();
            list.add(name);
            System.out.println("co tiep tuc nhap(y/n):");
            choose = s.nextLine();
        } while (choose.equalsIgnoreCase("y"));
    }
    public void OutPut(){
        for(String ListNameStudent : list){
            System.out.println("ho va ten sinh vien: "+ListNameStudent);
         }
    }
    
    public void OutPutRandom(){
        Collections.shuffle(list);
        OutPut();
    }
    public void OutPutSortName(){
        Collections.sort(list,(a,b)->a.compareTo(b));
        OutPut();
    }
    public void findAndDelete(Scanner s){
        String nameDelete;
        System.out.println("nhap ten can xoa: ");
        nameDelete = s.nextLine();
        
        for(String item : list){
            if(item.equals(nameDelete)){
                list.remove(item);
            }
        }
        
    }
}
