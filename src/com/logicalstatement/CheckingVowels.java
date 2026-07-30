package com.logicalstatement;
import java.util.Scanner;

public class CheckingVowels {

    public static void main(String[] args) {

        System.out.println("Check whether the char is vowel or not");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the char:");
        char ch = sc.next().charAt(0);

        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
                || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("It is a vowel");
        } else {
            System.out.println("Not a vowel");
        }

        sc.close();
    }
}