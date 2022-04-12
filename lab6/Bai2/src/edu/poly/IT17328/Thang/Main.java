
package edu.poly.IT17328.Thang;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Product> list = new ArrayList<>();
        
        for(int i = 0; i < 5; i++){
         Product product = new Product();
         product.InputProduct(s);
         list.add(product);
        }
        
        for(Product pd : list){
            if(pd.getManufacturer().equalsIgnoreCase("nokia")){
                pd.OutPutProduct();
            }
        }
    }
}
