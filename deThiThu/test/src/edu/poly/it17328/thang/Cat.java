package edu.poly.it17328.thang;

public class Cat {

    private String name;
    private int speed;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        System.out.println("meo dang chay voi toc do: " + speed);
    }

    boolean catchRat(Rat rat) {
        if (rat.getSpeed() == speed) {
            return true;
        } else {
            return false;
        }
    }

    void eatRat(Rat food){
        if(catchRat(food) && food.getWeight() <= 5){
            System.out.println("Mum mun, chuột hơi gầy");
        }else if(catchRat(food) && food.getWeight() > 5){
            System.out.println("Mum mun, ngon tuyệt");
        }else if(!catchRat(food)){
            System.out.println("meo meo, đói quá");
        }
    }
}
