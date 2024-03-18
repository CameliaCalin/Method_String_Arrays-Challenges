package Methods;

import java.util.Scanner;

/*Create a program to check if a number is self-dividing number.

A self-dividing number is a number that is divided by every digit it contains. For example, 128:

128 % 1 == 0
128 % 2 == 0
128 % 8 == 0 */
public class SelfDividingNumber {
    //method to check self dividing number
    boolean checkSelfDivide(int number){
        int num = number;
        int digit;

        while(num != 0){
            digit = num % 10;
            if (digit == 0 || number % digit != 0){
                return false;
            }
            num=num/10;
        }

        return true;


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        SelfDividingNumber obj = new SelfDividingNumber();

        boolean result = obj.checkSelfDivide(number);

        if (result){
            System.out.println("Self Dividing Number");
        }
        else {
            System.out.println("Not a Self Dividing Number");
        }
        input.close();
    }
}
