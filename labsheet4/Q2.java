/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet4;

/**
 *
 * @author shinr
 */
import java.util.Scanner;
public class Q2 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first integer from the user
        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        // Get the second integer from the user
        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        // Check the relationship between the two integers
        if (firstNumber == secondNumber) {
            System.out.println(firstNumber + " = " + secondNumber);
        } else if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " > " + secondNumber);
        } else {
            System.out.println(firstNumber + " < " + secondNumber);
        }

        scanner.close();
    }
}

    

