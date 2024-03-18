package Methods;

public class UseSameMethodTwice {
    // Create a method
    static void printNumbers(int n1, int n2) {
        System.out.println(n1);
        System.out.println(n2);
    }

    public static void main(String[] args) {
        // Call the method twice
        printNumbers(5, 100);
        printNumbers(10, 200);
    }
}
