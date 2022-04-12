package edu.poly.it17328.thang;

import static java.lang.Integer.sum;
import java.util.ArrayList;
import java.util.Scanner;

public class QLChicken {

    private ArrayList<Chicken> list = new ArrayList<>();

    public void init() {
        list.add(new Chicken("no1", "den", 1000));
        list.add(new Chicken("no2", "do", 10200));
        list.add(new Chicken("no3", "lam", 100));
        
    }

    public void inputChicken(Scanner s) {
        String choose = "y";
        do {
            Chicken ck = new Chicken();
            ck.input(s);
            list.add(ck);
            System.out.println("co tiep thuc hay khong(y/n): ");
            choose = s.nextLine();
        } while (!choose.equalsIgnoreCase("n"));
    }

    public void inThongTin() {
        for (Chicken ck : list) {
            ck.inThongTin();
        }
    }

    public void findMinAndMax(Scanner s) {
        System.out.println("nhap khoang nho nhat: ");
        int min = Integer.parseInt(s.nextLine());
        System.out.println("nhap khoang lon nhat: ");
        int max = Integer.parseInt(s.nextLine());

        for (Chicken ck : list) {
            if (ck.getPrice() >= min && ck.getPrice() <= max) {
                ck.inThongTin();
            }
        }
    }

    public void sortPrice() {
        list.sort((a, b) -> {

            Integer o1 = a.getPrice();
            Integer o2 = b.getPrice();
            return o1.compareTo(o2);
        });
        
        inThongTin();
    }

    public double AVGPrice() {

        int sum = 0;
        System.out.println("gia trung binh la: ");
        for (Chicken ck : list) {
            sum += ck.getPrice();
        }
        double AVG = (double) sum / list.size();
        return AVG;
    }

}
