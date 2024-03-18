package Methods;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

/*Create a program to calculate simple interest using a method.

The formula to calculate simple interest is:

Simple Interest = (principal * time * rate) / 100 */
public class CalculateSimpleInterest {
    double simpleInterest(double principal, double time, double rate){
        double result = (principal * time * rate) / 100;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a value for principal: ");
        double principal = input.nextDouble();
        System.out.println("Please enter a value for time:");
        double time = input.nextDouble();
        System.out.println("Please enter a value for rate:");
        double rate = input.nextDouble();


        CalculateSimpleInterest obj = new CalculateSimpleInterest();
        double result = obj.simpleInterest(principal, time, rate);
        System.out.println("Your result is " + result);
    }



}
