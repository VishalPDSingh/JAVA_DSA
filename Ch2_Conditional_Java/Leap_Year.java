package Ch2_Conditional_Java;

import java.util.Scanner;

public class Leap_Year {
    // public static void leapYear(int n)
    // {
    // if(n%4 == 0)
    // {
    // if(n%100 == 0)
    // {
    // if(n%400 ==0)
    // {
    // System.out.println("Leap Year");
    // }
    // else
    // {
    // System.out.println("Not leap year");
    // }
    // }
    // else
    // {
    // System.out.println("Not leap year");
    // }
    // }
    // else
    // {
    // System.out.println("Not leap year");
    // }
    // }

    // simple way
    public static void simLeapYear(int n) {
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            System.out.println("leap year");
        } else {
            System.out.println("Not leap year");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int n = sc.nextInt();
        simLeapYear(n);
        sc.close();
    }
}
