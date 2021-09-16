import javax.swing.*;
import java.text.DecimalFormat;
import java.util.jar.JarOutputStream;

public class TrianglePerimeter {

    /*
    Create a program which when given three coordinates of a triangle, calculates the perimeter.

    (2,3) , (5, 7) , (-2, 8) -> 18.47

    Program should round to 2 decimals and include two methods,
    one for returning the distance between two points and another
    for calculating the perimeter of a triangle.

    1.plan - coordinate x1 y1 x2 y2 x3 y3
    2. calculate distances
    3. calculate perimeter
    4 display results
    5.round numbers
     */

    public static void main(String[] args) {

    int x1 = getInput("point 1, x-coordinates: ");
    int y1 = getInput("point 1, x-coordinates: ");

    int x2 = getInput("point 1, x-coordinates: ");
    int y2 = getInput("point 1, x-coordinates: ");

    int x3 = getInput("point 1, x-coordinates: ");
    int y3 = getInput("point 1, x-coordinates: ");

        double distance1 = distance1(x1, x2, y1, y2);
        double distance2 = distance2(x1, x2, y1, y2);
        double distance3 = distance3(x1, x2, y1, y2);
        double perimeter = triPerimeter(distance1, distance2, distance3);

    outputResults(perimeter);
    System.exit(0);


    }


    public static int getInput(String message){

        return Integer.parseInt(JOptionPane.showInputDialog(message));
}

public static double distance(int x1, int x2, int y1, int y2){
        Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);


    }

public static double triPerimeter(double side1, double side2, double side3) {
    return side1 + side2 + side3;


}
public static void outputResults(double perimeter){
    DecimalFormat round = new DecimalFormat("#,###.00");
    JOptionPane.showInputDialog(null, "the perimeter is " + round.format(perimeter));
}


}
