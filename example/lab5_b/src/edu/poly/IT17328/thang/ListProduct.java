
package edu.poly.IT17328.thang;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class ListProduct {
     ArrayList<product> list = new ArrayList<>();

     public void initialization() {
        list.add(new product("gao", 9,"viet nam"));
        list.add(new product("nokia", 8, "viet nam "));
        list.add(new product("thoc", 10,"viet nam"));
    }

    public void inputListProduct(Scanner s) {
        String choose = "y";
        do {
            product st = new product();
            st.input(s);
            list.add(st);
            System.out.println("tiep tuc hay khong(y/n): ");
            choose = s.nextLine();
        } while (!choose.equals("n"));
    }

    public void outputListProduct() {
        for (product sv : list) {
            sv.output();
        }
    }
    
     public void Sortpoin() {
       
        list.sort((a, b) -> {
            Double d1 = a.getPoin();
            Double d2 = b.getPoin();

            return d2.compareTo(d1);
        });
      
         System.out.println("san pham sau khi xap xep la: ");
         outputListProduct();
    }
}
