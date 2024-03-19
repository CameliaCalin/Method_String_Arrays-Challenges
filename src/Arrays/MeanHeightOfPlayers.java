package Arrays;

import java.util.Scanner;

/*Create a program to find the mean height of players present in a football team.

The formula to calculate the mean is:

mean = sum of all elements / number of elements*/
public class MeanHeightOfPlayers {
    public static void main(String[] args) {
        double[] heights = new double[11];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < heights.length; i++){
            heights[i] = input.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < heights.length; i++){
            sum += heights[i];
        }

        double mean = sum / heights.length;
        System.out.println(mean);
    }
}
