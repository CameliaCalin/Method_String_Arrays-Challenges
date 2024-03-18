package Methods;

import java.util.Scanner;

/*Create a program to find the GCD of two numbers using a method.

GCD (Greatest Common Divisor) of two numbers is the largest number that can exactly divide both the numbers.  */
public class GCDOfTwoNumbers {
    int findGCD(int num1, int num2){
        int gcd=1;

        for(int i = 1; i<= num1 && i<= num2; i++){
            gcd=i;
        }

        return gcd;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a value for number 1:");
        int number1 = input.nextInt();
        System.out.println("Please enter a value for number 2:");
        int number2 = input.nextInt();

        GCDOfTwoNumbers obj = new GCDOfTwoNumbers();
        int gcd = obj.findGCD(number1, number2);
        System.out.println(gcd);

        input.close();
    }


}
