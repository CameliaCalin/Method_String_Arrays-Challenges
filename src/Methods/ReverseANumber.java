package Methods;

import java.util.Scanner;

/*Create a program to reverse a number using a method. */
public class ReverseANumber {
    int findReverse(int number){
        int reversed = 0;
        int remainder;

        while(number != 0){
             remainder = number % 10;
             reversed = reversed * 10 + remainder;
             number /= 10;

        }
        return  reversed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = input.nextInt();

        ReverseANumber obj = new ReverseANumber();
        int result = obj.findReverse(number);
        System.out.println(result);
        input.close();
    }
}
