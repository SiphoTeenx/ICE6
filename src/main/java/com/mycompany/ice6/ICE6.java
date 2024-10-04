/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ice6;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class ICE6 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine();
            
            int vowelCount = countVowels(sentence);
            
            System.out.println("Number of vowels: " + vowelCount);
        }
    }

    public static int countVowels(String sentence) {
        int vowelCount = 0;
        sentence = sentence.toLowerCase(); // Convert to lowercase

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);

            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelCount++;
            }
        }

        return vowelCount;
    
    }
}
