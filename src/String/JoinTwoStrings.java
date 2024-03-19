package String;

import java.util.Scanner;

/*Create a program to join two strings.*/
public class JoinTwoStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text1 = input.nextLine();
        String text2 = input.nextLine();

        String joinedString = text1.concat(text2);
        System.out.println(joinedString);
}
}