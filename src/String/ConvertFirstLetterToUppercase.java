package String;

import java.util.Scanner;

/*Problem Description
Create a program to convert the first letter of a string to uppercase.

Get a string input for the text variable.
Convert the first letter to uppercase.
Hint: Use the substring() method.

substring(start index, end index) - returns a part of the string.

For Example:

text = programiz
text.substring(0, 3) - returns substring from index 0 to index 3 - 1, which is pro.*/
public class ConvertFirstLetterToUppercase {
    public static void main(String[] args) {
        // get input value for string
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // use substring() to split the input string to two strings
        // first substring contains the first letter
        // hint: to access first letter, use indexes 0 and 1
        String firstLetter = text.substring(0, 1);

        // second substring contains the remaining letters
        // hint: to use remaining letters, use indexes 1 and string.length()
        String remainingLetters = text.substring(1, text.length());

        // change the first letter to uppercase
        firstLetter = firstLetter.toUpperCase();

        // join the two substrings
        text = firstLetter + remainingLetters;
        System.out.println(text);

        input.close();
    }
}
