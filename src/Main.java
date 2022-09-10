import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Create calculator object and introduce app
        Calculator calc = new Calculator();
        calc.introduceApp();

        // Get user input for and perform calculation
        calc.performCalculation();

        // Exit program
        calc.endProgram();

    }
}