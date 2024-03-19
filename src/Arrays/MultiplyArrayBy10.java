package Arrays;

import java.util.Scanner;

public class MultiplyArrayBy10 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        for (int number : numbers){
            System.out.println(number*10);
        }

    }
}
