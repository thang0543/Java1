
package edu.poly.IT17338.Thang;

import java.util.Scanner;


public class Liststudent {

  public static  final int max = 50;
    static String academic(Double point){
        String sortPoint = " ";
         if(point < 5 && point >=0){
              sortPoint = "Yeu";
          }else if(point >= 5 && point <= 6.5){
              sortPoint = "Trung Binh";
          }else if(point >= 6.5 && point <= 7.5){
              sortPoint = "Kha";
          }else if(point >= 7.5 && point <= 9){
              sortPoint = "Gioi";
          }else if(point >= 9 && point <=10){
              sortPoint = "xuat Sac";
          }else{
              sortPoint = "Khong hop le";
          }
         return sortPoint;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String name[] = new String[max];
        String nameTmp;
        double point[] = new double[max];
        double pointTmp;
        int index = 0;
        String choose = "y";
        
          do {  
             
            System.out.print("\n Nhap ho va ten: ");
               name[index] = s.nextLine();
            System.out.print("Nhap diem: ");
               point[index] = s.nextDouble();
                s.nextLine();
                index++;
                if(index > max){
                    System.out.print("\n da qua so luong ");
                    break;
                }
            System.out.print("Tiep tuc nhap khong(y/n): ");
            choose = s.nextLine();
        } while(choose.equalsIgnoreCase("y"));

//          for(int i = 0; i < index; i++){
//              System.out.printf("%s \t%f \t%s \n",name[i],point[i],academic(point[i]));
//          }
        
          for(int i = 0; i < index - 1; i++){
           for(int j = i + 1; j < index;j++){
               if(point[i] < point[j]){
                   pointTmp= point[i];
                   point[i] = point[j];
                   point[j] = pointTmp;
                 
                   nameTmp = name[i];
                   name[i] = name[j];
                   name[j] = nameTmp;
               }
           }
        }
          for(int i = 0; i < index; i++){
              System.out.printf(" %s \t%f \t%s \n",name[i],point[i],academic(point[i]));
          }
    }
    
}
