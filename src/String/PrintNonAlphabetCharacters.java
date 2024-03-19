package String;

import java.util.Scanner;

public class PrintNonAlphabetCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // run a for loop to access each character of a string
        // hint: run loop from 0 to string.length() - 1
        for (int i = 0; i < text.length(); i++) {

            // access each character using charAt()
            char x = text.charAt(i);
            x = Character.toLowerCase(x); // Conversia caracterului la minuscule

            if ((x >= 'a' && x <= 'z')) {
                continue;
            }

            System.out.println(x);
        }

        input.close();
    }
}
