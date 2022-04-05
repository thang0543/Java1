package poly2;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLNV {

    ArrayList<Student> list = new ArrayList<>();

    public void initialization() {
        list.add(new Student("nam", 9));
        list.add(new Student("hang", 8));
        list.add(new Student("thu", 10));
    }

    public void inputListStudent(Scanner s) {
        String choose = "y";
        do {
            Student st = new Student();
            st.input(s);
            list.add(st);
            System.out.println("tiep tuc hay khong(y/n): ");
            choose = s.nextLine();
        } while (!choose.equals("n"));
    }

    public void outputListStudent() {
        for (Student sv : list) {
            System.out.println("name=" + sv.getName() + ", poin=" + sv.getPoin());
        }
    }

    public void SortName() {
        //c1
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        // c2 lambda
        list.sort((a, b) -> a.getName().compareTo(b.getName()));
        Collections.sort(list, com);
    }

    public void SortPoin() {
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                Double d1 = o1.getPoin();
                Double d2 = o2.getPoin();

                return d1.compareTo(d2);
            }
        };
        list.sort((a, b) -> {
            Double d1 = a.getPoin();
            Double d2 = b.getPoin();

            return d1.compareTo(d2);
        });

    }
}
