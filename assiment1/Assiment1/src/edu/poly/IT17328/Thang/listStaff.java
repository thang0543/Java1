package edu.poly.IT17328.Thang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class listStaff {

    private ArrayList<staff> listStaff = new ArrayList<>();

    public void inputListStaff(Scanner s) {
        int choose;
        do {
            System.out.println("nhap chuc vu(1: hanh chanh, 2: tiep thi, 3: truong phong, 4:thoat): ");
            choose = Integer.parseInt(s.nextLine());
            if (choose == 4) {
                break;
            }
            switch (choose) {
                case 1:
                    administrativeStaff adm = new administrativeStaff();
                    adm.inputStaff(s);
                    listStaff.add(adm);
                    break;
                case 2:
                    marketingStaff mak = new marketingStaff();
                    mak.inputMarketingStaff(s);
                    listStaff.add(mak);
                    break;
                case 3:
                    manager man = new manager();
                    man.inputManager(s);
                    listStaff.add(man);
                    break;

                default:
                    System.out.println("vui long nhap lai");
            }
        } while (true);
    }

    public void outputListStaff() {
        for (staff list : listStaff) {
            if (list instanceof administrativeStaff) {
                ((administrativeStaff) list).outputStaff();
            } else if (list instanceof marketingStaff) {
                ((marketingStaff) list).ouputMarketingStaff();
            } else if (list instanceof manager) {
                ((manager) list).outputManager();
            }

        }
    }

    public void findEmpolyeeId(Scanner s) {
        System.out.print("nhap ma nhan vien can tim: ");
        String checkid = s.nextLine();
        staff checkInformationStaff = null;

        for (staff information : listStaff) {
            if (information.getId().equalsIgnoreCase(checkid)) {
                checkInformationStaff = information;
                break;
            }
        }
        if (checkInformationStaff != null) {
            if (checkInformationStaff instanceof administrativeStaff) {
                ((administrativeStaff) checkInformationStaff).outputStaff();
            } else if (checkInformationStaff instanceof marketingStaff) {
                ((marketingStaff) checkInformationStaff).ouputMarketingStaff();
            } else if (checkInformationStaff instanceof manager) {
                ((manager) checkInformationStaff).outputManager();
            }
        } else {
            System.out.println(" nhan vien co ma: " + checkid + " khong ton tai");
        }
    }

    public void deleteEmployeeId(Scanner s) {
        System.out.print("nhap ma nhan vien can xoa: ");
        String checkid = s.nextLine();
        staff checkInformationStaff = null;

        for (staff information : listStaff) {
            if (information.getId().equalsIgnoreCase(checkid)) {
                checkInformationStaff = information;
                break;
            }
        }

        if (checkInformationStaff != null) {
            listStaff.remove(checkInformationStaff);
            System.out.printf("nhan vien co ma %s da duoc xoa", checkid);
        } else {
            System.out.printf("nhan vien co ma %s khong ton tai trong danh sach", checkid);
        }
    }

    public void updateEmployeeId(Scanner s) {
        System.out.print("nhap ma nhan vien can chinh sua: ");
        String checkid = s.nextLine();
        staff checkInformationStaff = null;

        for (staff information : listStaff) {
            if (information.getId().equalsIgnoreCase(checkid)) {
                checkInformationStaff = information;
                break;
            }
        }
        if (checkInformationStaff != null) {
            if (checkInformationStaff instanceof administrativeStaff) {
                ((administrativeStaff) checkInformationStaff).inputStaff(s);
            } else if (checkInformationStaff instanceof marketingStaff) {
                ((marketingStaff) checkInformationStaff).inputMarketingStaff(s);
            } else if (checkInformationStaff instanceof manager) {
                ((manager) checkInformationStaff).inputManager(s);
            }
        } else {
            System.out.printf("nhan vien co ma %s khong ton tai trong danh sach", checkid);
        }
    }
    
    public void findEmpolyeeSalary(Scanner s){
        boolean flase = false;
        System.out.println("nhap khoang luong: ");
        System.out.print("luong thap nhat: ");
        double min = Double.parseDouble(s.nextLine());
        System.out.print("luong cao nhat: ");
        double max = Double.parseDouble(s.nextLine());
        System.out.printf(" nhan vien trong khoang luong [%f, %f]",min,max);
        for(staff empolyeeSalary : listStaff){
            if(empolyeeSalary.getSalary() >= min && empolyeeSalary.getSalary() <= max){
                empolyeeSalary.outputStaff();
                flase = true;
            }
        }
        if(false == false){
            System.out.printf("khong ton tai nhan vien nao trong khoang luong [%f, %f]",min,max);
        }
    }
    
    public  void sortUserName(){
        Collections.sort(listStaff,(a,b)->a.getUserName().compareTo(b.getUserName()));
    }
    
    public void sortEmpolyeeIncome(){
        Collections.sort(listStaff, (a,b)->(int)(a.getIncome() - b.getIncome()));
    }
    
      public void top5EmpolyeeIncome(){
        Collections.sort(listStaff, (a,b)->(int)(a.getIncome() - b.getIncome()));
        if(listStaff.size() > 5){
            for(int i = 0; i < 5 && i <= listStaff.size(); i++){
            if(listStaff.get(i).getPosition().equalsIgnoreCase("hanh chanh")){
                ((administrativeStaff)listStaff.get(i)).outputStaff();
            }else if(listStaff.get(i).getPosition().equalsIgnoreCase("tiep thi")){
                ((marketingStaff)listStaff.get(i)).ouputMarketingStaff();
            }else if(listStaff.get(i).getPosition().equalsIgnoreCase("truong phong")){
                ((manager)listStaff.get(i)).outputManager();
            }
        }
        }else{
             System.out.println(listStaff);
        }
    }
}
