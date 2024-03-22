import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        
        do {
            System.out.print("Enter a number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter another number: ");
            double num2 = scanner.nextDouble();
            
            System.out.print("Enter the operation (+, -, *, /, %): ");
            char operation = scanner.next().charAt(0);
            
            switch (operation) {
                case '+':
                    System.out.println("Result: " + sum(num1, num2));
                    break;
                case '-':
                    System.out.println("Result: " + sub(num1, num2));
                    break;
                case '*':
                    System.out.println("Result: " + multi(num1, num2));
                    break;
                case '/':
                    System.out.println("Result: " + div(num1, num2));
                    break;
                case '%':
                    System.out.println("Result: " + mod(num1, num2));
                    break;
                default:
                    System.out.println("Invalid operation.");
            }
            
            System.out.print("Do you want to perform another operation? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        
        scanner.close();
    }
    
    public static double sum(double a, double b) {
        return a + b;
    }
    
    public static double sub(double a, double b) {
        return a - b;
    }
    
    public static double multi(double a, double b) {
        return a * b;
    }
    
    public static double div(double a, double b) {
        return a / b;
    }
    
    public static double mod(double a, double b) {
        return a % b;
    }
}
