import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result;
        char operator;
        boolean continueCalc = true;

        System.out.println("=== Simple Console Calculator ===");

        while (continueCalc) {
            System.out.print("\nEnter first number: ");
            num1 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            operator = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if(num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
            }

            System.out.print("\nDo you want to continue? (y/n): ");
            char choice = sc.next().charAt(0);
            if (choice == 'n' || choice == 'N') {
                continueCalc = false;
            }
        }

        System.out.println("Calculator closed.");
        sc.close();
    }
}
