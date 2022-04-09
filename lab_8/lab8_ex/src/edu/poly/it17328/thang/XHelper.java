
package edu.poly.it17328.thang;


public class XHelper {
    
  static public int num;
  
   public static int sumElement(int ...x){
      int sum = 0;
      
      for(int index : x){
          sum += index;
      }
      return sum;
  }
}
