package za.ac.wsu.s219422648;

/**
 *
 * @author 219422648 Bongiwe Hlatshwayo
 */
public class Circle {
    
    //Decleration
    private float radius;        //Radius of the circle
    private int x, y;            //Coordinates of the centre

    //sets the radius
    public void setRadius(float radius) { 
        this.radius = radius;
    }
    
    //Returns the redius 
    public float getRadius() {
        return radius;
    }
    
    
    //Sets the x value
    public void setX(int x) {
        this.x = x;
    }

    //Returns the x value
    public int getX() {
        return x;
    }
    
    //Sets the y value
    public void setY(int y) {
        this.y = y;
    }

    //Returns the y value
    public int getY() {
        return y;
    }

    //Calculates the Area 
    public float calculateArea() {
        //Area
        float areaOfCircle;
        //Formula for calculating the Circumference
        areaOfCircle = (float) (radius * radius * 3.14);

        //Checking if the radius is less than zero
        if (radius < 0) { 
            //Promt the user 
            System.out.println("The radius is less than 0");
            return 0; 
            
        } else {
            //returns the area if the radius is not less zero
            return areaOfCircle; 
        }

    }

    //Calculates the Circumference
    public float calculateCircumference() {
        //Circumference
        float circumf;
        
        //Formula for calculating the Circumference
        circumf = (float) (2 * 3.14 * radius);
        
        //Checking if the radius is less than zero
        if (radius < 0) {
            //Promt the user 
            System.out.println("The radius is less than 0");
            return 0;
        
        } else {
            //returns the Circumference if the radius is not less zero
            return circumf;
        }
    }
    
    //Calculates the Diameter
    public float calculateDiameter() {
        
        float d; //Diameter 
        //Formula for calculating the diameter
        d = (float) (2 * radius);
        
        //Checking if the radius is less than zero
        if (radius < 0) {
             //Promt the user 
            System.out.println("The radius is less than 0");
            return 0;
            

        } else {
            //returns the diameter if the radius is not less zero
            return d;
        }

    }

}


