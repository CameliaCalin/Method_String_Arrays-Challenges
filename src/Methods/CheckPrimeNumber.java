package Methods;

import java.util.Scanner;

/* Create a program to check whether a number is prime or not using a method.
   A prime number is a number that is only divided by either 1 or itself. For example, 7, 5, 19, etc. */
public class CheckPrimeNumber {

    // Method to check whether a number is prime or not
    void checkPrime(int number) {
        int flag = 0;

        // run loop from 2 to number - 1
        // check if number is divisible by any value between 2 to number - 1
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                flag = 1;
                break;
            }
        }

        // check the value of flag
        // if it's 1, print Not a Prime Number, else print Prime Number
        if (flag == 1) {
            System.out.println("Not a Prime Number");
        } else {
            System.out.println("Prime Number");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for number
        int number = input.nextInt();

        CheckPrimeNumber obj = new CheckPrimeNumber();

        // call checkPrime with number as argument
        obj.checkPrime(number);

        input.close();
    }
}
