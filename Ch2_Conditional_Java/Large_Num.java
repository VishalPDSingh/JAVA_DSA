package Ch2_Conditional_Java;

import java.util.Scanner;

public class Large_Num {
    public static void largest(int a, int b) {
        if (a > b) {
            System.out.println("A is largest");
        } else {
            System.out.println("B is largest");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");

        int a = sc.nextInt();
        int b = sc.nextInt();
        largest(a, b);
        sc.close();
    }
}
