/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.challenge;

/**
 *
 * @author Manish Goud Bandharapu
 */
public abstract class AbstractShape {
    // private attributes
    private String shapeType;

    // constructors
    public AbstractShape() {
        this.shapeType = "Shape instantiated with no information.";
    }

    public AbstractShape(String shapeType) {
        this.shapeType = shapeType;
    }

    // getters and setters
    public String getShapeType() {
        return this.shapeType;
    }

    public void setShapeType(String shapeTypeInput) {
        this.shapeType = shapeTypeInput;
    }

    // abstract methods with no implementation - must be overridden
    public abstract double getArea();
    public abstract double getPerimeter();

    

}
