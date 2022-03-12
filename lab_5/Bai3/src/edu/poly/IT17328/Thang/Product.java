
package edu.poly.IT17328.Thang;


public class Product {
    private String nameProduct;
    private double price;

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(String nameProduct, double price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }
    
    
}
