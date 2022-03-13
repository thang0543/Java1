
package edu.poly.IT17328.Thang;

import java.util.Scanner;

public class Student {

        private final String remail = "\\w+@\\w+\\.\\W+";
        private final String rePhone = "0\\d{9,10}";
        private final String reIdentityCard = "[0-9]{9}";

         private String name, email,PhoneNumber, identityCard;
  
    public Student() {
    }

    public Student(String name, String email, String PhoneNumber, String identityCard) {
        this.name = name;
        this.email = email;
        this.PhoneNumber = PhoneNumber;
        this.identityCard = identityCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

   
   
   

 
    public void InputStudent(Scanner s){
        System.out.print("nhap ten: ");
        name = s.nextLine();
        System.out.print("nhap email: ");
        email = s.nextLine();
        System.out.print("nhap so dien thoại: ");
        PhoneNumber = s.nextLine();
        System.out.print("nhap so CMND: ");
        identityCard = s.nextLine();
        if(!email.matches(remail)){
            System.out.println("ban da nhap sai email");
        }
        if(!PhoneNumber.matches(rePhone)){
            System.out.println("ban da nhap sai so dien thoai");
        }
        if(!identityCard.matches(reIdentityCard)){
            System.out.println("ban da nhap sai so CMDN");
        }
    }
   
    public void OutPutStudent(){
        System.out.println("ho va ten: "+name+"\t so dien thoai: "+PhoneNumber+"\t email: "+email+"\t so CMND: "+identityCard);
    }

}
