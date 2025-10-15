/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author ff
 */
public class Chapter1_Challenge_1_2 {
    public static void main(String[] args) {
        // Step 1: Initialize the array of winning numbers
        String[] winningNumbers = {"12-34-56-78-90", "33-44-11-66-22", "01-02-03-04-05"};

        // Variables to track the winning number with the highest average
        double highestAverage = 0.0;
        String winningNumberWithHighestAvg = "";

        // Step 2: Analyze each number in the array
        for (String number : winningNumbers) {
            System.out.println("Analyzing: " + number);

            // Remove dashes to form one continuous string
            String cleaned = number.replace("-", "");

            // Convert the string to a char array
            char[] chars = cleaned.toCharArray();

            // Create an integer array from the char array
            int[] digits = new int[chars.length];
            int sum = 0;

            // Using a for loop to fill the digits array and calculate the sum
            for (int i = 0; i < chars.length; i++) {
                digits[i] = Character.getNumericValue(chars[i]);
                sum += digits[i];
            }

            // Calculate average
            double average = (double) sum / digits.length;

            // Print results for this ticket
            System.out.println("Digit Sum: " + sum + ", Digit Average: " + average);

            // Check if this is the highest average so far
            if (average > highestAverage) {
                highestAverage = average;
                winningNumberWithHighestAvg = number;
            }
        }

        // Step 3: Print the winning number with the highest average
        System.out.println("The winning number with the highest average is: "
                + winningNumberWithHighestAvg + " with an average of " + highestAverage);
    }
}



    

