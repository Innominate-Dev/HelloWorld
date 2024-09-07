import java.util.Scanner; // import the scanner class

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num1 = userInput.nextInt();

        System.out.println("Enter your second number: ");

        int num2 = userInput.nextInt();

        System.out.println("Your two numbers add up to " + (num1 + num2)); // adding numbers
        userInput.close();
    }
}
