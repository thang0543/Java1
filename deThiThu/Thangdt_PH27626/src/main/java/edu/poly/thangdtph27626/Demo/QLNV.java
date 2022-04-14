
package edu.poly.thangdtph27626.Demo;

import java.util.ArrayList;
import java.util.Scanner;


public class QLNV {
    private ArrayList<NhanVien> list = new ArrayList<>();
    
    public void init(){
         list.add(new NhanVien("ph122", "thang", 12220, 2003));
         list.add(new NhanVien("ph123", "thanh", 12290, 1994));
         list.add(new NhanVien("ph124", "hoa", 300, 2004));
         list.add(new NhanVien("ph125", "thien", 12220, 2006));
         list.add(new NhanVien("ph126", "hang", 10, 1987));
     }
    
    public void input(Scanner s ){
        String choose = "y";
        do {            
            NhanVien nv = new NhanVien();
            nv.input(s);
            list.add(nv);
            System.out.println("co tiep tuc hay khong: ");
            choose = s.nextLine();
        } while (!choose.equalsIgnoreCase("n"));
    }

    public  void ouput(){
        for(NhanVien nv : list){
            nv.inThongTin();
            System.out.println("tuoi: "+nv.age());
        }
    }
    
    public  void outputSalary(){
         for(NhanVien nv : list){
           if(nv.getSalary() > 500){
                nv.inThongTin();
           }
        }
    }
    
    public  void outputSalaryMinMax(Scanner s){
        System.out.println("nhap luong min: ");
        double min = Double.parseDouble(s.nextLine());
        System.out.println("nhap luong max: ");
        double max = Double.parseDouble(s.nextLine());
        int count = 0;
        System.out.println("danh sach nhan vien trong khoang luong la: ");
        for(NhanVien nv : list){
           if(nv.getSalary() >= min && nv.getSalary() <= max){
                nv.inThongTin();
                count++;
           }
        }
        if(count  == 0){
            System.out.println("khong ton tai nhan vien");
        }
    }
    
    public void findId(Scanner s){
        System.out.println(" nhap ma nhan vien: ");
        String id = s.nextLine();
        
        for(NhanVien nv : list){
            if(nv.getId().equals(id)){
                nv.inThongTin();
            }
        }
    }
    
    public void outputAge(){
       for(NhanVien nv : list){
            if(nv.age() >= 18 && nv.age() <= 30){
                nv.inThongTin();
            }
        } 
    }
    
    public void countAgeGreateThan18(){
       for(NhanVien nv : list){
            if(nv.age() > 18){
                nv.inThongTin();
            }
        } 
    }
    
    public void outputSortName(){
        list.sort((a,b)-> b.getName().compareTo(a.getName()));
    }

    public void outputSortSalary(){
        list.sort((a,b)-> {
            Double o1 = a.getSalary();
            Double o2 = b.getSalary();
            return o2.compareTo(o1);
        });
    }
    
     public void outputSortAge(){
        list.sort((a,b)-> {
            Integer o1 = a.age();
            Integer o2 = b.age();
            return o1.compareTo(o2);
        });
    }
     public void findName(Scanner s){
        System.out.println(" nhap ten nhan vien: ");
        String name = s.nextLine();
        
        for(NhanVien nv : list){
            if(nv.getName().equalsIgnoreCase(name)){
                nv.inThongTin();
            }
        }
    }
     public void outputStatus(Scanner s){
         System.out.println(" nhap trang thai(1:tot;2:binh thuong): ");
         int choose = Integer.parseInt(s.nextLine());
         
         switch (choose) {
             case 1:
                 for(NhanVien nv : list){
                     if(nv.getTrangThai().equalsIgnoreCase("tot")){
                         nv.inThongTin();
                     }
                 }
                 break;
               case 2:
                 for(NhanVien nv : list){
                     if(nv.getTrangThai().equalsIgnoreCase("binh thuong")){
                         nv.inThongTin();
                     }
                 }
                 break;
             default:
                 throw new AssertionError();
         } 
     }
     
      public void deleteId(Scanner s){
        System.out.println(" nhap ma nhan vien: ");
        String id = s.nextLine();
        
        for(NhanVien nv : list){
            if(nv.getId().equals(id)){
                list.remove(nv);
                break;
            }
        }
    }
       public void outputAgeEven(){
        for(NhanVien nv : list){
            if(nv.age() %2 == 0){
                nv.inThongTin();
            }
        }
    }
    
     public void outputAgeOdd(){
        for(NhanVien nv : list){
            if(nv.age() %2 != 0){
                nv.inThongTin();
            }
        }
    }
     
     public void outputFindName(Scanner s){
         System.out.println("nhap ten nhan vien: ");
         String chuCai = s.nextLine();
         
         for(NhanVien nv : list){
//             String lastname = nv.getName().substring(nv.getName().lastIndexOf(" "), nv.getName().length());
             if(nv.getName().startsWith(chuCai)){
                 nv.inThongTin();
             }
               
//                if(nv.getName().indexOf(name) != -1){
//                    nv.inThongTin();
//                }
         }
     }
}
