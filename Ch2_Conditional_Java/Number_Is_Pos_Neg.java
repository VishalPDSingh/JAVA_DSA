package Ch2_Conditional_Java;

import java.util.Scanner;

public class Number_Is_Pos_Neg {

    public static void number(int n)
    {
        if(n>0)
        {
            System.out.println("Number is Positive");
        }else if(n<0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        number(n);
        sc.close();
    }
}
