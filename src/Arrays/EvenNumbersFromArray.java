package Arrays;

import java.util.Scanner;

/*Create a program to print only the even numbers from an array.*/
public class EvenNumbersFromArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; ++i) {

            // check if the array element is even
            if (numbers[i] % 2 == 0) {
                // print the array element
                System.out.println(numbers[i]);
            }
        }

        input.close();
    }
}
