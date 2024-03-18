package Methods;

import java.util.Scanner;

/* Problem Description
Create a program to compute the area of a circle using a method.

The formula to compute the area of a circle is:

Area = 3.14 * radius * radius*/
public class AreaOfCircle {
    double computeArea( double pi, double radius){
        double result = pi * radius * radius;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a value for radius: ");
        double radius = input.nextDouble();
        double pi = 3.14;

        AreaOfCircle obj = new AreaOfCircle();
        double result = obj.computeArea(pi, radius);
        System.out.println(result);
    }




}
