/***************************************************************
****************
*
* Kean University
* Spring 2026
* Course: CPS2231 - Computer Programming
*
* Author: Mikayla Long, 2231*02
*
* Homework 4
****************************************************************
*********/
package Unit4;

import java.util.Random;

public class TestRectangle {
    public static void main (String[] args) {
    //rectangle called with overloaded constructor
    Rectangle rect1 = new Rectangle(12,12);
    
    //rectangle called with default constructor
    Rectangle rect2 = new Rectangle();
    
    //prints out the characteristics of both objects
    System.out.println(rect1.toString());
    System.out.println(rect2.toString());
    
    //generate number between 1 and 15 (inclusive) and create array based on it
    Random rand = new Random();
    int arraySize = rand.nextInt(15) + 1; 
    Rectangle[] rectangleArray = new Rectangle[arraySize];
    
    /* goes through each element and uses overloaded constructor to randomly
    generate rectangles between 10 and 50 (inclusive) and fill array */
    for (int i = 0; i < rectangleArray.length; i++) {
        int randomLength = rand.nextInt(41) + 10; 
        int randomWidth = rand.nextInt(41) + 10;
        rectangleArray[i] = new Rectangle(randomLength, randomWidth);
    }

    //prints total number of objects
    //this includes overloaded and default at the beginning for a min of 3 and max of 17
    System.out.println("\nNumber of Rectangle Objects Created: " + Rectangle.getNumOfRectangles());

    //runs isSquare method through array
    boolean square = false;
    for (int i = 0; i < rectangleArray.length; i++) {
        if (rectangleArray[i].isSquare()) {
            System.out.println("Square: Length is " + rectangleArray[i].getLength() + ", Width is " + rectangleArray[i].getWidth());
                square = true;
            }
        }

        // If no rectangles are squares, display the required message
        if (!square) {
            System.out.println("There are no squares in the object array.");
        }
    }
}

class Rectangle {
    private int length;
    private int width;
    private static int numOfRectangles = 0;

    //Default Constructor
    public Rectangle() {
        width = 0;
        length = 0;
        numOfRectangles++;
    }
    //Overloaded Constructor
    public Rectangle(int rect_length, int rect_width) {
        length = rect_length;
        width = rect_width;
        numOfRectangles++;
    }
    
    //getters
    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }
    public static int getNumOfRectangles() {
        return numOfRectangles;
    }
    
    //setters
    public void setWidth(int rect_width) {
        width = rect_width;
    }
    public void setLength(int rect_length) {
        length = rect_length;
    }
    
    //methods
    public boolean isSquare() {
        if (length == width) {
            return true;
        } else {
            return false;
        }
    }
    public String toString() {
        String s = "Rectangle [Width = " + width + ", Length = " + length + "]";
        return s;
}
}
