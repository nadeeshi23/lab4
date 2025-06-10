/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet4;

import java.util.Scanner;

/**
 *
 * @author shinr
 */
public class Q10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the user inputs
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0.0;

        // Perform the calculation based on the selected operator
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    return;
                }
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Invalid operator. Please enter a valid operator.");
                return;
        }

        // Display the result
        System.out.println("Result: " + result);

        scanner.close();
    }
}


