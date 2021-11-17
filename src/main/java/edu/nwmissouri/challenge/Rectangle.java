/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.challenge;

/**
 *
 * @author Manish Goud Bandharapu
 */
public class Rectangle extends AbstractShape {
    // private attribute
    private double length;
    private double width;

    // constructor
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    Rectangle(double r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    
    public double getArea() {
        return  length * width;
    }

    
    public double getPerimeter() {
        return 2 * (length  * width );
    }

    // add an executable main() method to test it
    public static void main(String[] args){
        //double r = 1.0;
        Rectangle r = new Rectangle(10,20);

        String type = r.getShapeType();
        double area = r.getArea();
        double perimeter = r.getPerimeter();

        System.out.println("===========================================");
        System.out.println("Rectangle");
        System.out.println("===========================================");
        System.out.println("A Rectangle's area will be " + area);
        System.out.println("A Rectangle's perimeter will be " + perimeter);
        System.out.println("===========================================");
   
}
    
}
