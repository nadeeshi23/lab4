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
public class Q8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for hourly rates and overtime hours
        final double HOURLY_RATE = 50.0;
        final int REGULAR_HOURS = 30;
        final int OVERTIME_HOURS_LEVEL1 = 25;

        // Get the number of hours worked from the user
        System.out.print("Enter the number of hours worked in a week: ");
        int hoursWorked = scanner.nextInt();

        // Calculate the weekly wages
        double wages = 0.0;

        if (hoursWorked <= REGULAR_HOURS) {
            wages = hoursWorked * HOURLY_RATE;
        } else if (hoursWorked > REGULAR_HOURS && hoursWorked <= (REGULAR_HOURS + OVERTIME_HOURS_LEVEL1)) {
            int overtimeHoursLevel1 = hoursWorked - REGULAR_HOURS;
            wages = REGULAR_HOURS * HOURLY_RATE + (overtimeHoursLevel1 * HOURLY_RATE * 1.5);
        } else {
            int overtimeHoursLevel1 = OVERTIME_HOURS_LEVEL1;
            int overtimeHoursLevel2 = hoursWorked - REGULAR_HOURS - OVERTIME_HOURS_LEVEL1;
            wages = REGULAR_HOURS * HOURLY_RATE + (overtimeHoursLevel1 * HOURLY_RATE * 1.5) + (overtimeHoursLevel2 * HOURLY_RATE * 2);
        }

        // Display the weekly wages
        System.out.println("Weekly wages: Rs. " + wages);

        scanner.close();
    }
}

    

