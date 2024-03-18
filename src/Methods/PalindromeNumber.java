package Methods;

import java.util.Scanner;

/*Create a program to check whether a number is palindrome using a method.

Definition:

A number is palindrome if the reverse of that number is equal to the original number. For example, 1001, 343, etc. */
public class PalindromeNumber {
    static int findReverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }
        return reversed;
    }

    // create checkPalindrome() method with two parameters: number and reversedNumber
    static void checkPalindrome(int number, int reversedNumber) {
        // check if two numbers are equal or not
        if (number == reversedNumber) {
            // print Palindrome Number, if they are equal.
            System.out.println("Palindrome Number");
        } else {
            // otherwise, print Not a Palindrome Number
            System.out.println("Not a Palindrome Number");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for number
        int number = input.nextInt();

        PalindromeNumber obj = new PalindromeNumber();

        // call findReverse() to find reverse of number
        int reversedNumber = obj.findReverse(number);

        // call checkPalindrome with arguments: number and reversedNumber
        // to check if number is palindrome
        obj.checkPalindrome(number, reversedNumber);

        input.close();
    }

}
