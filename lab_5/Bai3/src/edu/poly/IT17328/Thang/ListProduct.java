
package edu.poly.IT17328.Thang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ListProduct {

    private ArrayList<Product> list = new ArrayList<>();
    
    public void InPut(Scanner s){
        String choose = "y";
        do{
            System.out.println("nhap ten san pham: ");
            String nameProduct = s.nextLine();
            System.out.println("nhap gia tien: ");
            double priceProduct = Double.parseDouble(s.nextLine());
            list.add(new Product(nameProduct, priceProduct));
             System.out.println("co tiep tuc nhap(y/n):");
            choose = s.nextLine();
        }while (choose.equalsIgnoreCase("y"));
    }
    public void OutPut(){
        for(Product listProduc : list){
            System.out.printf("\n ten: %s \t gia: %.2f ",listProduc.getNameProduct(),listProduc.getPrice());
        }
    }
    public void OutPutSortPrice(){
        Collections.sort(list,(a,b)-> (int)(a.getPrice()-b.getPrice()));
        OutPut();
    }
    public void findAndDeteleProduc(Scanner s){
        String nameProductDetele;
        System.out.println("nhap ten san pam can xoa: ");
        nameProductDetele = s.nextLine();
        
        for(Product nameProduct : list){
         if(nameProduct.getNameProduct().equals(nameProductDetele)){   
             list.remove(nameProductDetele);
             break;
             }
        }
    }
    public void AVG_Price(){
        double avg = 0, sum = 0;
        for(Product priceProduct : list){
            sum += priceProduct.getPrice();
        }
        avg = sum / list.size();
        System.out.println("gia tri trung binh cua san pham la: "+avg);
    }
}
