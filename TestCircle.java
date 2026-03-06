package Unit4;
import java.awt.Color;

public class TestCircle {
    public static void main(String[] args){
        Circle c1 = new Circle();
        System.out.println(c1.getRadius());
        System.out.println(c1.getColor());


        Circle c2 = new Circle(5.0, Color.green);
        System.out.println(c2.getRadius());
        System.out.println(c2.getColor());
    }
}

class Circle {
    private double radius;
    private Color color;

    // Constructor
    //Default Constructor
    public Circle() {
        radius = 0.0;
        color =  Color.blue;
        System.out.println("The default constructor is called.");
    }
    //Overloaded Constructor
    public Circle(double radius_size, Color color_name) {
        radius = radius_size;
        color = color_name;
        System.out.println("The overloaded constructor is called.");

    }
    //getters
    public Color getColor() {
        return color;
    }
    public double getRadius() {
        return radius;
    }

    //setters
    public void setColor(Color color_name) {
        color = color_name;
    }
    public void setRadius(double radius_size) {
        if (radius_size > 0) {
            radius = radius_size;
        } else {
            System.out.println("Please pass a value greater than 0.");
        }
    }
    
    //methods
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}