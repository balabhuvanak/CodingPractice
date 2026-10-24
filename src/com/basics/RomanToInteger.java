
package com.basics;
//13.RomanToInteger
import java.util.Scanner;

public class RomanToInteger {

    static int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            int current = getValue(str.charAt(i));

            if (i + 1 < str.length()
                    && current < getValue(str.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
