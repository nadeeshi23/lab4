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
public class Q1 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first number from the user
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        // Get the second number from the user
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Check if the second number is zero
        if (secondNumber == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            // Check if the first number is divisible by the second number
            if (firstNumber % secondNumber == 0) {
                System.out.println(firstNumber + " is divisible by " + secondNumber);
            } else {
                System.out.println(firstNumber + " is not divisible by " + secondNumber);
            }
        }

        scanner.close();
    }
}


