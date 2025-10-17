package Ch2_Conditional_Java;

import java.util.Scanner;

public class EvenOdd {

    public static void isEvenOdd(int n)
    {
        if(n%2 == 0)
        {
            System.out.println("Number is Even");
        }else
        {
            System.out.println("Number is Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        isEvenOdd(n);
        sc.close();
    }
}
