///Application

package CircleApp;
import za.ac.wsu.s219422648.Circle;

/**
 *
 * @author 219422648 Bongiwe Hlatshwayo
 */
public class CircleApp {

    public static void main(String[] args) {

        Circle circle1 = new Circle(); //object of Circle
        Circle circle2 = new Circle(); //Object of Circle
        Circle circle3 = new Circle(); // creates an object circle
        
        System.out.println("_______________Circle 1_______________");
        //Setting the given values: radius, x and y
        circle1.setRadius(0);
        circle1.setX(0);
        circle1.setY(0);
        
        //prints the radius 
        System.out.println("Radius  = " + circle1.getRadius());
        //prints the x value
        System.out.println("x   = " + circle1.getX());
        //prints the y value
        System.out.println("y   = " + circle1.getY());
        //Prints a new line 
        System.out.println();
        
        //Prints out the Area of the circle
        System.out.println("Area		: " + circle1.calculateArea());
        //Prints out the Circumference of the circle
        System.out.println("Circumference	: " + circle1.calculateCircumference());
        //Prints out the Diameter of the circle
        System.out.println("Diameter	: " + circle1.calculateDiameter());
        //Prints 2 new lines 
        System.out.println("\n");

        
        
        
        System.out.println("_______________Circle 2_______________");
        //Setting the given values: radius, x and y
        circle2.setRadius(-2);
        circle2.setX(2);
        circle2.setY(2);

        //prints the radius  
        System.out.println("Radius  = " + circle2.getRadius());
        //prints the x value
        System.out.println("x   = " + circle2.getX());
        //prints the y value
        System.out.println("y   = " + circle2.getY());
        //Prints a new line 
        System.out.println();
        
        //Prints out the Area of the circle
        System.out.println("Area		: " + circle2.calculateArea());
        //Prints out the Circumference of the circle
        System.out.println("Circumference	: " + circle2.calculateCircumference());
        //Prints out the Diameter of the circle
        System.out.println("Diameter	: " + circle2.calculateDiameter());
        //Prints 2 new lines 
        System.out.println("\n");

        
        System.out.println("_______________Circle 3_______________");
        //Setting the given values: radius, x and y
        circle3.setRadius(3);
        circle3.setX(0);
        circle3.setY(0);

        //prints the radius 
        System.out.println("Radius  = " + circle3.getRadius());
        //prints the x value
        System.out.println("x   = " + circle3.getX());
        //prints the y value
        System.out.println("y   = " + circle3.getY());
        //Prints a new line  
        System.out.println();
        
        //Prints out the Area of the circle
        System.out.println("Area		: " + circle3.calculateArea());
        //Prints out the Circumference of the circle
        System.out.println("Circumference	: " + circle3.calculateCircumference());
        //Prints out the Diameter of the circle
        System.out.println("Diameter	: " + circle3.calculateDiameter());
        //Prints 2 new lines 
        System.out.println("\n");
    }//end of main

}//end of class 
