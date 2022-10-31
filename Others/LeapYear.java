/* A year is a leap year if it is divisible by 4. However, if the year is divisible by 100, then it is a leap year only when it is also divisible by 400.

Write a program that reads a year from the user, and checks whether or not it is a leap year. */


import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        int iYear = Integer.valueOf(scan.nextLine());

        if (iYear % 100 != 0 && iYear % 400 != 0 && iYear % 4 != 0){
            System.out.println("The year is not a leap year");
        } else if (iYear % 100 == 0 && iYear % 400 != 0 && iYear % 4 == 0){
            System.out.println("The year is not a leap year");
        } else if (iYear % 100 == 0 && iYear % 400 == 0){
            System.out.println("The year is a leap year");
        } else {
            System.out.println("The year is a leap year");
        }


    }
}
