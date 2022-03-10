
package edu.poly.IT17333.Thang;

import java.util.Scanner;


public class SanPham {

    private String nameProduct;
    private Double priceProduct;
    private Double discountProduct;
     

    public SanPham(String nameProduct, Double priceProduct, Double discountProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.discountProduct = discountProduct;
    }

    public SanPham(String nameProduct, Double priceProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }
    
    public SanPham() {
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public Double getDiscountProduct() {
        return discountProduct;
    }

    public void setDiscountProduct(Double discountProduct) {
        this.discountProduct = discountProduct;
    }

    private Double getImportTax() {
        return  priceProduct * 0.1;
    }
    
    public void Input(Scanner s){
        System.out.println("nhap ten san pham: ");
        nameProduct = s.nextLine();
        System.out.println("nhap gia san pham: ");
        priceProduct = Double.parseDouble(s.nextLine());
        System.out.println("nhap giam gia: ");
        discountProduct = Double.parseDouble(s.nextLine());
        
    }
    public void Ouput(){
        System.out.printf("ten san pham: %s \t don gia %.2f \t giam gia %.2f \t thuế nhập khâu: %f \n",
                nameProduct,priceProduct,discountProduct,getImportTax()); 
    }

}
