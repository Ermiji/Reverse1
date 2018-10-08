package com.seb;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score;
        String answer = "n";

        do {
            System.out.println("Enter an exam score: ");
            score = sc.nextInt();

            if (score >= 97 && score <= 100) {
                System.out.println("Excellent. Your grade is A+. ");
            } else if (score >= 94 && score < 97) {
                System.out.println("Good job. Your grade is A");
            } else if (score >= 90 && score < 94) {
                System.out.println("Good. Your grade is A-");
            } else if (score >= 87 && score < 90) {
                System.out.println("Your grade is B+.");
            } else if (score >= 84 && score < 87) {
                System.out.println("Good job. Your grade is B.");
            } else if (score >= 80 && score < 84) {
                System.out.println("Good. Your grade is B-");
            } else if (score >= 77 && score < 80) {
                System.out.println("Your grade is C+.");
            } else if (score >= 74 && score < 77) {
                System.out.println("Good job. Your grade is C.");
            } else if (score >= 70 && score < 74) {
                System.out.println("Good. Your grade is C-");
            } else if (score >= 67 && score < 70) {
                System.out.println("Good job. Your grade is D+.");
            } else if (score >= 64 && score < 67) {
                System.out.println("Good. Your grade is D");
            } else if (score >= 60 && score < 64) {
                System.out.println("Your grade is D-.");
            } else {
                System.out.println("Your grade is F.");
            }

            sc.nextLine();
            System.out.println("Do you want to enter another score (Y/N)? ");
            answer = sc.nextLine();

        } while (answer.equals("y"));

    }
}
