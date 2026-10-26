
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Simple Java Calculator ===");
        
        // Input the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        // Input the operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        // Input the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result;
        boolean validOperation = true;
        
        // Perform calculation based on operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Handle division by zero
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                    result = 0;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Error: Invalid operator entered.");
                validOperation = false;
                result = 0;
                break;
        }
        
        // Print the final result if the operation was valid
        if (validOperation) {
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        }
        
        scanner.close();
    }
}
