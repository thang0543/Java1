
package edu.poly.it17328.thang;


public class GameRatandCat {

   
    public static void main(String[] args) {
       Cat tom = new Cat("tom",15);
       Rat Jerry = new Rat("Jerry", 3, 15);
       tom.catchRat(Jerry);
       tom.eatRat(Jerry);
    }
    
}
