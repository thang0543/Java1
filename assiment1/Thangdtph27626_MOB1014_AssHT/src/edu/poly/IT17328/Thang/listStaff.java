package edu.poly.IT17328.Thang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class listStaff {

    private ArrayList<Staff> listStaff = new ArrayList<>();

    
    public boolean checkInit() {
        if (listStaff.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void init() {
        listStaff.add(new Manager(12, "thang", "Ph27626", 1500000, "Truong phong"));
        listStaff.add(new Manager(12, "hang", "Ph27629", 1500000, "Truong Phong"));
        listStaff.add(new MarketingStaff(10, 10, "thu", "Ph27620", 1400000, "tiep Thi"));
        listStaff.add(new MarketingStaff(10, 12, "tha", "Ph27621", 1420000, "tiep Thi"));
        listStaff.add(new AdministrativeStaff("phuong", "Ph27625", 130000, "hanh chanh"));
    }

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
                    AdministrativeStaff adm = new AdministrativeStaff();
                    adm.inputStaff(s);
                    listStaff.add(adm);
                    break;
                case 2:
                    MarketingStaff mak = new MarketingStaff();
                    mak.inputMarketingStaff(s);
                    listStaff.add(mak);
                    break;
                case 3:
                    Manager man = new Manager();
                    man.inputManager(s);
                    listStaff.add(man);
                    break;

                default:
                    System.out.println("vui long nhap lai");
            }
        } while (true);
    }

    public void outputListStaff() {
        for (Staff list : listStaff) {
            if (list instanceof AdministrativeStaff) {
                ((AdministrativeStaff) list).outputStaff();
            } else if (list instanceof MarketingStaff) {
                ((MarketingStaff) list).ouputMarketingStaff();
            } else if (list instanceof Manager) {
                ((Manager) list).outputManager();
            }

        }
    }

    public void findEmpolyeeId(Scanner s) {
        System.out.print("nhap ma nhan vien can tim: ");
        String checkid = s.nextLine();
        Staff checkInformationStaff = null;

        for (Staff information : listStaff) {
            if (information.getId().equalsIgnoreCase(checkid)) {
                checkInformationStaff = information;
                break;
            }
        }
        if (checkInformationStaff != null) {
            if (checkInformationStaff instanceof AdministrativeStaff) {
                ((AdministrativeStaff) checkInformationStaff).outputStaff();
            } else if (checkInformationStaff instanceof MarketingStaff) {
                ((MarketingStaff) checkInformationStaff).ouputMarketingStaff();
            } else if (checkInformationStaff instanceof Manager) {
                ((Manager) checkInformationStaff).outputManager();
            }
        } else {
            System.out.println(" nhan vien co ma: " + checkid + " khong ton tai");
        }
    }

    public void deleteEmployeeId(Scanner s) {
        System.out.print("nhap ma nhan vien can xoa: ");
        String checkid = s.nextLine();
        Staff checkInformationStaff = null;

        for (Staff information : listStaff) {
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
        Staff checkInformationStaff = null;

        for (Staff information : listStaff) {
            if (information.getId().equalsIgnoreCase(checkid)) {
                checkInformationStaff = information;
                break;
            }
        }
        if (checkInformationStaff != null) {
            if (checkInformationStaff instanceof AdministrativeStaff) {
                ((AdministrativeStaff) checkInformationStaff).inputStaff(s);
            } else if (checkInformationStaff instanceof MarketingStaff) {
                ((MarketingStaff) checkInformationStaff).inputMarketingStaff(s);
            } else if (checkInformationStaff instanceof Manager) {
                ((Manager) checkInformationStaff).inputManager(s);
            }
        } else {
            System.out.printf("nhan vien co ma %s khong ton tai trong danh sach", checkid);
        }
    }

    public void findEmpolyeeSalary(Scanner s) {
        boolean flase = false;
        System.out.println("nhap khoang luong: ");
        System.out.print("luong thap nhat: ");
        double min = Double.parseDouble(s.nextLine());
        System.out.print("luong cao nhat: ");
        double max = Double.parseDouble(s.nextLine());
        System.out.printf(" nhan vien trong khoang luong [%f, %f]", min, max);
        for (Staff empolyeeSalary : listStaff) {
            if (empolyeeSalary.getSalary() >= min && empolyeeSalary.getSalary() <= max) {
                empolyeeSalary.outputStaff();
                flase = true;
            }
        }
        if (false == false) {
            System.out.printf("khong ton tai nhan vien nao trong khoang luong [%f, %f]", min, max);
        }
    }

    public void sortUserName() {
        Collections.sort(listStaff, (a, b) -> a.getUserName().compareTo(b.getUserName()));
    }

    public void sortEmpolyeeIncome() {
        Collections.sort(listStaff, (a, b) -> (int) (a.getIncome() - b.getIncome()));
    }

    public void top5EmpolyeeIncome() {
        Collections.sort(listStaff, (a, b) -> (int) (a.getIncome() - b.getIncome()));
        if (listStaff.size() > 5) {
            for (int i = 0; i < 5 && i <= listStaff.size(); i++) {
                if (listStaff.get(i).getPosition().equalsIgnoreCase("hanh chanh")) {
                    ((AdministrativeStaff) listStaff.get(i)).outputStaff();
                } else if (listStaff.get(i).getPosition().equalsIgnoreCase("tiep thi")) {
                    ((MarketingStaff) listStaff.get(i)).ouputMarketingStaff();
                } else if (listStaff.get(i).getPosition().equalsIgnoreCase("truong phong")) {
                    ((Manager) listStaff.get(i)).outputManager();
                }
            }
        } else {
            System.out.println(listStaff);
        }
    }
}
