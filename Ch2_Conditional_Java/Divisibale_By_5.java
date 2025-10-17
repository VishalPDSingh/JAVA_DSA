package Ch2_Conditional_Java;

import java.util.Scanner;

public class Divisibale_By_5 {
    public static void divisibale(int n)
    {
        if(n%5 == 0)
        {
            System.out.println("Divisiable by 5");
        }
        else
        {
            System.out.println("Not Divisiable by 5");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        divisibale(n);
        sc.close();
    }
}
