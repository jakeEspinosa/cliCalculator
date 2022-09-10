import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    Scanner input = new Scanner(System.in);

    public void introduceApp() {
        System.out.println("Welcome to my calculator!");
    }

    public void performCalculation() {
        double firstNum = 0;
        double secondNum = 0;
        char operator = '0';
        double result = 0;

        while (true) {
            while (true) {
                System.out.println("Enter your first number (or 0 to exit):");
                try {
                    firstNum = input.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please only enter an integer or decimal number!");
                    input.nextLine();
                }
            }

            if (firstNum == 0) {
                break;
            }
                while (true) {
                    System.out.println("Enter the operator you wish to use (+, -, *, /, %)");
                    operator = input.next().charAt(0);
                    if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                        break;
                    } else {
                        System.out.println("Please only enter +, -, *, /, or %!");
                    }
                }

                while (true) {
                    System.out.println("Enter your second number:");
                    try {
                        secondNum = input.nextDouble();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Please only enter an integer or decimal number!");
                        input.nextLine();
                    }
                }

                switch (operator) {
                    case '+':
                        result = (firstNum + secondNum);
                        break;
                    case '-':
                        result = (firstNum - secondNum);
                        break;
                    case '*':
                        result = (firstNum * secondNum);
                        break;
                    case '/':
                        result = (firstNum / secondNum);
                        break;
                    case '%':
                        result = (firstNum % secondNum);
                        break;
                }
            System.out.println("Result: " + result);
            }
        }

        public void endProgram() {
            System.out.println("Thanks for using my calculator app!");
        }
    }