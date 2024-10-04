/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask6;

import java.util.Scanner; 

/**
 *
 * @author samuk
 */
public class Icetask6 {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Call the countVowels method and store the result in vowelCount
        int vowelCount = countVowels(sentence);
        
        // Output the number of vowels in the input sentence
        System.out.println("Number of vowels: " + vowelCount);
    }

    // Method to count the number of vowels in a given string
    public static int countVowels(String sentence) {
        int count = 0;  // Variable to store the count of vowels
        sentence = sentence.toLowerCase(); // Convert the sentence to lowercase

        // Iterate through each character in the string
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i); // Get the character at index i

            // Check if the character is a vowel by calling indexOfVowel
            if (indexOfVowel(c) >= 0) {
                count++; // If it's a vowel, increment the count
            }
        }

        return count; // Return the final vowel count
    }

    // Method to check if a character is a vowel by checking its index in "aeiou"
    private static int indexOfVowel(char c) {
        return "aeiou".indexOf(c);
    }
}