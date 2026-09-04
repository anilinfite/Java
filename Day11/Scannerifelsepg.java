package Day11;

import java.util.Scanner;

public class Scannerifelsepg {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your Age"); // work on this program more and more
       int age = sc.nextInt();
       
        // int age = 25;
        if (age >=18)
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not Elgible");
        }
    }
}
