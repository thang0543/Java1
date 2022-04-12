
package edu.poly.it17328.thang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class listPhongHoc {
    private ArrayList<phongHoc> list = new ArrayList<>();
    
    public void init(){
        list.add(new phongHoc("p188",3,"p"));
        list.add(new phongHoc("p184",2,"p"));
        list.add(new phongHoc("p182",3,"d"));
        list.add(new phongHoc("p182",4,"e"));
    }
    public void inputPhongHoc(Scanner s ){
        String choose = "y";
        do {   
            phongHoc ph = new phongHoc();
            ph.input(s);
            list.add(ph);
            System.out.println("co tiep tuc nhap hay khong(y/n): ");
            choose = s.nextLine();
        } while (!choose.equalsIgnoreCase("n"));
    }
    
    public void outputPhongHoc(){
        for(phongHoc ph : list){
            ph.output();
        }
    }
    
    public void countP(){
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getNha().equalsIgnoreCase("p")){
                count++;
            }
        }
        System.out.printf("số lượng phong học tại tòa p la: %d \n",count);
    }
    
    public void outputListTang3(){
        System.out.println("các phong hoc tai tang 3 la: ");
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getTang() == 3){
                list.get(i).output();
            }
        }
    }
    
    public void sort(){
       list.sort((a,b)->{
           
           return b.getNha().compareTo(a.getNha());
       });
       outputPhongHoc();
    }
}
