
package edu.poly.it17328.thang;


public class XHelper {
    
  static public int num;
  static {
      System.out.println("Hello word");
  }
   public static int sumElement(int ...x){
      int sum = 0;
      
      // tenlop.tenThuocTinh
      // tenlop.tenPhuongThuc
      for(int index : x){
          sum += index;
      }
      return sum;
  }
}
