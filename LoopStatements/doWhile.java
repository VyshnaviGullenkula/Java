package LoopStatements;

import java.util.Scanner;

//Code to result the sum of the given 4 digit number using do while loop
public class doWhile {
    public static void main(String[] args) {
        int n, r, sd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4 digit number ");
        n = sc.nextInt();

        if (n >= 1000 && n <= 9999) {
            do {
                r = n % 10;     // return the last digit of the number as remainder
                sd = sd + r;
                n = n / 10;     // removes the last digit of the number
            }
            while (n > 0);
            System.out.println("Sum of digits = " + sd);
        } else {
            System.out.println("Not a 4 digit number");
        }
    }
}

