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
public class Q9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the grade from the user
        System.out.print("Enter your grade: ");
        char grade = scanner.next().charAt(0);

        // Convert the grade to uppercase (in case the user enters a lowercase letter)
        grade = Character.toUpperCase(grade);

        // Determine the comment based on the grade using a switch statement
        String comment;

        switch (grade) {
            case 'A':
                comment = "Excellent";
                break;
            case 'B':
                comment = "Well Done";
                break;
            case 'C':
                comment = "Good";
                break;
            case 'D':
                comment = "You Pass";
                break;
            case 'F':
                comment = "Better Try Again";
                break;
            default:
                comment = "Invalid Grade";
        }

        // Display the comment
        System.out.println("Comment: " + comment);

        scanner.close();
    }
}

    

