import java.util.Scanner; // import the scanner class

public class Calculator {
    public static void main(String[] args) throws Exception {
        boolean turnOffCal = false;

        Scanner userInput = new Scanner(System.in);
        
        while (turnOffCal == false) {
            System.out.println("Enter a number: ");

            int num1 = userInput.nextInt();

            System.out.println("what operator would you like to use? (* , / , +, - )");

            char operator = userInput.next().charAt(0);

            System.out.println("Enter your second number: ");

            int num2 = userInput.nextInt();

            if(operator == '/')
            {
                System.out.println("Your two numbers divide up to " + (num1 / num2)); // dividing numbers
            }
            else if(operator == '*')
            {
                System.out.println("Your two numbers multiply to " + (num1 * num2)); // multiply numbers
            }
            else if(operator == '+')
            {
                System.out.println("Your two numbers add up to " + (num1 + num2)); // adding numbers
            }
            else if(operator == '-')
            {
                System.out.println("Your two numbers take away to " + (num1 - num2)); // take away numbers
            }
            else{
                System.out.println("Fatal Error calculation could not be made.");
            }

            System.out.println("Would you like to continue using THE calculator (y/n)");
            char continueUsingCal = userInput.next().charAt(0);

            if(continueUsingCal == 'y')
            {
                continue;
            }
            else if(continueUsingCal == 'n')
            {
                System.out.println("Thank you for using THE calculator :]");
                turnOffCal = true;
                userInput.close();
                break;
            }
        }
    }
}
