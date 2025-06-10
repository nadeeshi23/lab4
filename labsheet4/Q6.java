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
public class Q6 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the cost price (CP) from the user
        System.out.print("Enter the cost price (CP): ");
        double costPrice = scanner.nextDouble();

        // Get the selling price (SP) from the user
        System.out.print("Enter the selling price (SP): ");
        double sellingPrice = scanner.nextDouble();

        // Calculate the profit or loss
        double profitOrLoss = sellingPrice - costPrice;

        // Determine whether there is a profit, loss, or no profit/loss
        if (profitOrLoss > 0) {
            System.out.println("There is a profit of $" + profitOrLoss);
        } else if (profitOrLoss < 0) {
            System.out.println("There is a loss of $" + Math.abs(profitOrLoss));
        } else {
            System.out.println("There is no profit or loss. Break-even.");
        }

        scanner.close();
    }
}

    

