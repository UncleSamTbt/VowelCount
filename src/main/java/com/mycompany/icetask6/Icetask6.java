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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countVowels(String sentence) {
        int count = 0;
        sentence = sentence.toLowerCase(); // Convert to lowercase

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (indexOfVowel(c) >= 0) {
                count++;
            }
        }

        return count;
    }

    private static int indexOfVowel(char c) {
        // Check if the character is a vowel
        return "aeiou".indexOf(c);
    }
}
