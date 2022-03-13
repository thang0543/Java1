
package edu.poly.IT17328.Thang;

import java.util.Scanner;

public class Student_IT extends ListStudent{
    private double html,java,css;

    public Student_IT() {
    }

    public Student_IT(double html, double java, double css, String name, String branch) {
        super(name, branch);
        this.html = html;
        this.java = java;
        this.css = css;
    }

    public Student_IT(double html, double java, double css) {
        this.html = html;
        this.java = java;
        this.css = css;
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }
    
    
    @Override
    public Double poin() {
        return (2*java +html +css)/4;
    }
    
    
  
}
