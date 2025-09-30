import java.util.Scanner; 

public class Calculator {

    // Method for addition 
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method for subtraction 
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method for multiplication 
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method for division 
    public static double divide(double num1, double num2) {
        // 
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero."); // Handle divide-by-zero 
            return Double.NaN; // Return "Not a Number" to indicate an error
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Use Scanner for user input 
        boolean continueCalculating = true;

        System.out.println("Welcome to the Java Console Calculator!");
        System.out.println("---------------------------------------");

        while (continueCalculating) { // Use a loop for multiple calculations 

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0.0;
            boolean isValidOperation = true;

            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
                    isValidOperation = false;
                    break;
            }

            if (isValidOperation) {
                // Check if the result is valid before printing
                if (!Double.isNaN(result)) {
                    System.out.println("Result: " + result);
                }
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String userChoice = scanner.next();
            if (userChoice.equalsIgnoreCase("no")) {
                continueCalculating = false;
            }
        }

        scanner.close(); 
        
    }
}