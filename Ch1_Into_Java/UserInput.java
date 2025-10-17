package Ch1_Into_Java;

import java.util.*;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Integer");
        int n = sc.nextInt();
        System.out.println("Integer value is " + n);

        System.out.println("Enter the value of floating ");
        float f = sc.nextFloat();
        System.out.println("Float value is " + f);

        System.out.println("Enter the word: ");
        String s1 = sc.next();
        System.out.println("word is : " + s1);

        System.out.println("Enter the Statements: ");
        String s2 = sc.nextLine();
        System.out.println("Statements is : " + s2);
        sc.close();
    }
}
