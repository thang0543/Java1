
package edu.poly.IT17328.Thang;

import static edu.poly.IT17328.Thang.Main.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


abstract public class ListStudent {
    private String name,branch;

    private ArrayList<ListStudent> list = new ArrayList<>();
    public ListStudent(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }

    public ListStudent() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    
    abstract public Double poin();
    
    public String academic(double poin){
        String classification ;
        if(poin < 5 && poin > 0){
            classification = "yeu";
        }else if(poin >=5 && poin < 6.5){
           classification  = "TB"; 
        }else if(poin >=6.5 && poin < 7.5){
           classification  = "Kha"; 
        }else if(poin >=7.5 && poin < 9){
           classification  = "Gioi"; 
        }else if(poin >=9 && poin <= 10){
           classification  = "Xuat sac"; 
        }else{
            classification = "khong hop le";
        }
        return classification;
    } 
    
//    public void outPut(){
//        System.out.println("ho va ten: "+name+"\t nganh: "+branch+"\t diem: "+poin()+"\t hoc luc: "+academic(poin()));   
//    }
    
      

    public void Input(Scanner s) {
        double html, css, java, marketing, sales;
        String chooseY = "y";
        do {
            System.out.println("nhap ten Sinh vien: ");
            name = s.nextLine();
            System.out.println("nhap ten nganh: ");
            branch = s.nextLine();
            if (branch.equalsIgnoreCase("IT")) {
                System.out.println("nhap diem html: ");
                html = Double.parseDouble(s.nextLine());
                System.out.println("nhap diem java: ");
                java = Double.parseDouble(s.nextLine());
                System.out.println("nhap diem css: ");
                css = Double.parseDouble(s.nextLine());
                ListStudent st = new Student_IT(html, java, css, name, branch);
                list.add(st);
            } else {
                System.out.println("nhap diem marketing: ");
                marketing = Double.parseDouble(s.nextLine());
                System.out.println("nhap diem sales: ");
                sales = Double.parseDouble(s.nextLine());
                ListStudent st = new Student_Biz(marketing, sales, name, branch);
                list.add(st);
            }
            System.out.println("co tiep tuc nhap hay khong(y/n): ");
            chooseY = s.nextLine();
        } while (chooseY.equalsIgnoreCase("y"));
    }

    public void Output() {
        System.out.println("--------------danh sach sinh vien----------------");
        for (ListStudent st : list) {
            System.out.println("ho va ten: " + st.getName() + "\t nganh: " + st.getBranch() + "\t diem: " + st.poin() + "\t xep loai: " + st.academic(st.poin()));
        }
    }

    public void outPutAcademic() {
        System.out.println("--------------danh sach sinh vien----------------");
        for (ListStudent st : list) {
            if (st.academic(st.poin()).equalsIgnoreCase("gioi")) {
                System.out.println("ho va ten: " + st.getName() + "\t nganh: " + st.getBranch() + "\t diem: " + st.poin() + "\t xep loai: " + st.academic(st.poin()));
            }
        }
    }

    Comparator<ListStudent> com = new Comparator<ListStudent>() {
        @Override
        public int compare(ListStudent o1, ListStudent o2) {
            return Double.compare(o1.poin(), o2.poin());
        }
    };

    public void outPutPoin() {
        Collections.sort(list, com);
        Output();
    }

    public void menu() {
        int choose;

        do {
            System.out.println("------------------------------menu----------------------------");
            System.out.println("1: nhap danh sach Sinh vien");
            System.out.println("2: xuat danh sach sinh vien");
            System.out.println("3: xuat dnah sach sinh vien có hoc luc gioi");
            System.out.println("4: sap xep danh sach sinh vien theo diem");
            System.out.println("5: thoat");
            System.out.println("nhap lua chon");
            choose = Integer.parseInt(s.nextLine());
            switch (choose) {
                case 1:
                    Input(s);
                    break;
                case 2:
                    Output();
                    break;
                case 3:
                    outPutAcademic();
                    break;
                case 4:
                    outPutPoin();
                    break;
                case 5:

                    break;
                default:
                    throw new AssertionError();
            }

        } while (true);
    }
}
