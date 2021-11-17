package edu.nwmissouri.challenge;

/**
 * Starting point for our app.
 */
public class App {

    public static void main(String[] args) {

        // test Circle class
        double r = 1.0;
        Circle c = new Circle(r);

        String type = c.getShapeType();
        double area = c.getArea();
        double perimeter = c.getPerimeter();

        System.out.println("===========================================");
        System.out.println("Circle");
        System.out.println("===========================================");
        System.out.println("Given radius: " + r);
        System.out.println("A Circle's area will be " + area);
        System.out.println("A Circle's perimeter will be " + perimeter);
        System.out.println("===========================================");

        // test more classes below

        
        Rectangle rect = new Rectangle(8.0, 9.0);

        String types = rect.getShapeType();
        double areaOfRectangle = rect.getArea();
        double perimeterOfRectangle = rect.getPerimeter();

        System.out.println("===========================================");
        System.out.println("Rectangle");
        System.out.println("===========================================");
        System.out.println("A Rectangle's area will be " + areaOfRectangle);
        System.out.println("A Rectangle's perimeter will be " + perimeterOfRectangle);
        System.out.println("===========================================");
        
        Square sqa = new Square(10);

        String typed = sqa.getShapeType();
        double areaOfSquare = sqa.getArea();
        double perimeterOfSquare = sqa.getPerimeter();

        System.out.println("===========================================");
        System.out.println("Square");
        System.out.println("===========================================");
        System.out.println("A Square's area will be " + areaOfSquare);
        System.out.println("A Square's perimeter will be " + perimeterOfSquare);
        System.out.println("=============================");
        
        EquilateralTriangle et = new EquilateralTriangle(5);

        String typeOf = et.getShapeType();
        double areaOfequilateralTriangle = et.getArea();
        double perimeterOfequilateralTriangle = et.getPerimeter();

        System.out.println("===========================================");
        System.out.println("EquilateralTriangle");
        System.out.println("===========================================");
        System.out.println("A EquilateralTriangle's area will be " + areaOfequilateralTriangle);
        System.out.println("A EquilateralTriangle's perimeters will be " + perimeterOfequilateralTriangle);
        System.out.println("===========================================");
    }

}