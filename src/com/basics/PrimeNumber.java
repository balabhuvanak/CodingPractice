
package com.basics;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;

        if (n < 2) {
            System.out.println(n + " is not Prime");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    c++;
                    break;
                }
            }

            String result = c > 0 ? "not Prime" : "Prime";
            System.out.println(n + " is " + result);
        }

        sc.close();
    }
}
