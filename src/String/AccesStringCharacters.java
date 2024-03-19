package String;

import java.util.Scanner;

/*Create a program to print each character of the string using a loop.*/
public class AccesStringCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        for( int i = 0; i< text.length(); i++){
            System.out.println(text.charAt(i));
        }
    }




}
