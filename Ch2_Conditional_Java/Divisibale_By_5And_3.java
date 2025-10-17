package Ch2_Conditional_Java;

import java.util.Scanner;

public class Divisibale_By_5And_3 {
    public static void divisbale(int n)
    {
        if(n%3==0 && n%5==0)
        {
            System.out.println("Disiable by 5 and 3");
        }else
        {
            System.out.println("Not Divisiable");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        divisbale(n);
        sc.close();
    }
}
