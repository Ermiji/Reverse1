package com.seb;
import java.util.Scanner;
public class Main {

    public static void reverse (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        String anotherNumber = "n";

        do {
            System.out.println("Enter a number ");
            num = keyboard.nextInt();

            keyboard.nextLine();

            for (int cnt = num; cnt >= 5; cnt--) {
                if((cnt % 7 == 0) && (cnt % 5 == 0)) {
                    System.out.println("CopyCat");
                }
                else if (cnt % 7 == 0) {
                    System.out.println("Cat");
                } else if (cnt % 5 == 0) {
                    System.out.println("Copy");
                }else {
                    System.out.println(num);
                }

            }
            System.out.println("Would you like to enter another number(y/n): ");
            anotherNumber = keyboard.nextLine();

        } while (anotherNumber.equals("y"));

        System.out.println("Thank you for playing!");
    }
}


/*Prompt the user for a number
*Print that number down to one
*if divisible by 5 = Copy
* if divisible by 7 = Cat
* if divisible by 5 & 7 = CopyCat
* otherwise print the number
 */