package Day11;

import java.util.*;

public class Ifelseifpgr {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = sc.nextInt();

        System.out.println("Citizenship: True/False");
        boolean citizen = sc.nextBoolean();
       
       
        if(age >= 18) //nestedif
        {
           if (citizen)  
           {
            System.out.println("Elgible");
           }
           else
           {
            System.out.println("Not Elgible");
           }
        }
        else
        {
            System.out.println("Age less than 18");
        }
            
    }
}
