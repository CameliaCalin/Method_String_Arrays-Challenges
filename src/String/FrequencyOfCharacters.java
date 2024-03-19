package String;

import java.util.Scanner;

/*Create a program to find the total occurrence of the character 'a' in a string.*/
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        char ch = 'a';

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        int count = 0;

        for (int i = 0; i < text.length(); i++)
         if (ch == text.charAt(i)){
             count++;
         }

        System.out.println(count);
    }
}
