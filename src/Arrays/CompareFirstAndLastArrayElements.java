package Arrays;

import java.util.Scanner;

/*Create a program to compare first and last array elements.*/
public class CompareFirstAndLastArrayElements {
    public static void main(String[] args) {
        int[] numbers = new int[6];

        Scanner input = new Scanner(System.in);

        for (int i = 1; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last){
            System.out.println("equal");
        }
        else {
            System.out.println(" not equal");
        }
        input.close();
    }
}
