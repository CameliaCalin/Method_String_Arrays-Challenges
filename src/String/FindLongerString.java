package String;

import java.util.Scanner;

/*Create a program to find the longer string among two strings.*/
public class FindLongerString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a text1: ");
        String text1 = input.nextLine();

        System.out.println("Please enter a text2: ");
        String text2 = input.nextLine();

        int length1 = text1.length();
        int length2 = text2.length();

        if (length1 > length2){
            System.out.println(text1);
        }
        else {
            System.out.println(text2);
        }
    }
}
