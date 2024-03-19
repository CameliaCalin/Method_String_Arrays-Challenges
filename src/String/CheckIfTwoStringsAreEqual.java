package String;

import java.util.Scanner;

/*Create a program to check if two strings are equal.*/
public class CheckIfTwoStringsAreEqual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();

        if (str1.equals(str2)){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
        input.close();
    }
}
