package Methods;


import java.util.Scanner;

/*Create a program to check if two arguments passed to a method are equal or not. */
public class CheckIfTwoArgumentsAreEqual {

    //create method with 2 arguments
    void myMethod(int num1, int num2){
        if(num1 == num2){
            System.out.println("Arguments are equal.");
        }
        else{
            System.out.println("Arguments arent equal.");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a input for number1: ");
        int number1 = input.nextInt();

        System.out.println("Please enter a input for number2: ");
        int number2= input.nextInt();

        // create an object of CheckIfTwoArgumentsAreEqual
        CheckIfTwoArgumentsAreEqual obj = new CheckIfTwoArgumentsAreEqual();
        // use obj to call the method with number1 and number2 arguments
        obj.myMethod(number1, number2);
        input.close();

    }
}
