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
public class Q5 {
    



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get marks from the user
        System.out.print("Enter the marks: ");
        int marks = scanner.nextInt();

        // Find the grade based on the marks
        String grade;

        if (marks >= 90 && marks <= 100) {
            grade = "A";
        } else if (marks >= 80 && marks < 90) {
            grade = "B";
        } else if (marks >= 70 && marks < 80) {
            grade = "C";
        } else {
            grade = "D";
        }

        // Display the grade
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

    

