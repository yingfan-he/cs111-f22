/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author:
 *
 *************************************************************************/

public class Sierpinski { 


    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {
        double height = length*(Math.sqrt(3)/2);
        return height;

	// WRITE YOUR CODE HERE
    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) {
        double x1 = x;
        double y1 = y;
        double x2 = x1 + (length/2);
        double y2 = y1 + height(length);
        double x3 = x1 - (length/2);
        double y3 = y1 + height(length);

        double[] xCoords = {x1,x2,x3};
        double[] yCoords = {y1,y2,y3};
        StdDraw.filledPolygon(xCoords, yCoords);


       

	 // WRITE YOUR CODE HERE
    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {
        if (n <= 0) {
            return;
        }
        filledTriangle(x, y, length);
        double bottomX = x;
        double xLeft = x - (length/2);
        double xRight = x + (length/2);
        double newY = y + height(length);
        sierpinski(n-1, xLeft, y, length/2);
        sierpinski(n-1, xRight, y, length/2);
        sierpinski(n-1, bottomX, newY, length/2);



	// WRITE YOUR CODE HERE
    }
    

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        
        StdDraw.line(0, 0, 1, 0);
        StdDraw.line(1, 0, 0.5, height(1));
        StdDraw.line(0.5, height(1),0 , 0);

        double x = 0.5;
        double y = 0;
        double length = 1;
        sierpinski(n, x, y, length/2);


	// WRITE YOUR CODE HERE 
    }
}

