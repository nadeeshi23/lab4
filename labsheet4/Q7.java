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
public class Q7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the speed from the user
        System.out.print("Enter the speed (in kmph): ");
        int speed = scanner.nextInt();

        // Calculate the fine based on the speed using if-else statements
        int fine = 0;

        if (speed >= 81 && speed <= 90) {
            fine = 500;
        } else if (speed >= 91 && speed <= 100) {
            fine = 750;
        } else if (speed > 100) {
            fine = 1000;
        } else {
            System.out.println("No fine for the given speed.");
        }

        // Display the fine amount (if applicable)
        if (fine > 0) {
            System.out.println("Fine amount: " + fine + " rupees.");
        }

        scanner.close();
    }
}

    

