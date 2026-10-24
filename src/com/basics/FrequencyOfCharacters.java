package com.basics;

import java.util.Scanner;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toLowerCase();
        int[] freq = new int[65536];

        // Count each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Print each distinct character only once
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (freq[ch] > 0) {
                System.out.println(
                    "Frequency of " + ch + " is: " + freq[ch]
                );
                freq[ch] = 0;
            }
        }

        sc.close();
    }
}