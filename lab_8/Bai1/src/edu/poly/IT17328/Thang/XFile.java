
package edu.poly.IT17328.Thang;

import static edu.poly.IT17328.Thang.SumNumbers.s;

public class XFile {
    public static final double Sum(double... element) {
        double sum = 0;
        for (double sumElement : element) {
            sum += sumElement;
        }
        return sum;
    }

    public static final double MinElement(double... element) {
        double min = element[0];
        for (double index : element) {
            min = Math.min(index, min);
        }
        return min;
    }

    public static final double MaxElement(double... element) {
        double max = element[0];
        for (double index : element) {
            max = Math.max(index, max);
        }
        return max;
    }

    public static final String toUpperFirstChar() {
        System.out.println("nhap ho va ten: ");
        String name = s.nextLine();
        String[] word = name.split(" ");

        StringBuilder bd = new StringBuilder();
        for (int i = 0; i < word.length; i++) {
            String item = word[i];
            if (!item.equals("")) {
                String firstChair = item.substring(0, 1).toUpperCase();
                item = firstChair + item.substring(1);
                bd.append(item).append(" ");

            }
        }
        return bd.toString().trim();
    }
}
