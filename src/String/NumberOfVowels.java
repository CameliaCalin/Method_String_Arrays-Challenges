package String;

import java.util.Scanner;

/*Create a program to count the number of vowels present in a string.*/
public class NumberOfVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        //convert the tring onput to lowercase for simplicity
        text = text.toLowerCase();

        // create a variable to count the number of vowels
        int vowels = 0;

        for (int i = 0; i < text.length(); i++){
            // acces each caracter usign charAt()
            boolean result = (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u');
            char x = text.charAt(i);

            if( result ){
                vowels++;
            }
        }
        System.out.println(vowels);
    }
}
