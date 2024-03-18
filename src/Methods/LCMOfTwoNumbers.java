package Methods;

import java.util.Scanner;

/*Create a program to find LCM of two numbers using a method.

LCM (Lowest Common Multiple) of two numbers, x and y is the smallest positive integer that is perfectly divisible by both x and y. */
public class LCMOfTwoNumbers {

    int findLCM(int num1 , int num2){
        int lcm = Math.max(num1, num2);

        while (true){
            if (lcm % num1 == 0 && lcm % num2==0){
                break;
            }
            lcm++;
        }
        return lcm;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        LCMOfTwoNumbers obj =  new LCMOfTwoNumbers();
        int lcm = obj.findLCM(number1, number2);
        System.out.println(lcm);

        input.close();
    }
}
