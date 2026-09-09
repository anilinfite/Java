package Day16;

import java.util.*;
public class Count
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int num = sc.nextInt();

        /*while (num > 0)
        {
            int digit = num % 10;
            num = num / 10;

            System.out.println(digit);
        }*/

        int count = 0;
        int num1 = 8671;

        while(num1 > 0)
        {
            //num1 = num1 % 10;
            num1 = num1/10;
            count++;
            
        }
        System.out.println(count);
    }
}