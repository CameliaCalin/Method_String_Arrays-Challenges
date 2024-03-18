package Methods;

import java.util.Scanner;

/*Create a method to find all the prime numbers between two intervals using a method. */
public class PrimeNumbersBetweenIntervals {
    boolean checkPrime(int number){
       int flag = 0;
        for (int i = 2; i<= number/2; i++){
            if (number % i == 0){
                flag = 1;
                break;
            }
        }

        if (flag == 1){
            return false;
        }
        else{
            return true;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get input value for two intervals
        int x = input.nextInt();
        int y = input.nextInt();

        PrimeNumbersBetweenIntervals obj = new PrimeNumbersBetweenIntervals();

        for (int i = x; i <= y; ++i) {

            // call checkPrime for every value between x and y
            boolean result = obj.checkPrime(i);

            // if returned value is true, print the number
            if (result) {
                System.out.println(i);
            }
        }

        input.close();
    }

}
