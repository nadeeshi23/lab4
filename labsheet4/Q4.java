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
public class Q4 {
    
  

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Use nested if statements to find the greatest number
        int greatestNumber;

        if (num1 >= num2) {
            if (num1 >= num3) {
                greatestNumber = num1;
            } else {
                greatestNumber = num3;
            }
        } else {
            if (num2 >= num3) {
                greatestNumber = num2;
            } else {
                greatestNumber = num3;
            }
        }

        // Display the greatest number
        System.out.println("The greatest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + greatestNumber);

        scanner.close();
    }
}

    


