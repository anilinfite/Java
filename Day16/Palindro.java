package Day16;
import java.util.*;
public class Palindro {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Value");
        int num = sc.nextInt();

        int num1 = 121;
        int reverse = 0;
        int temp = num;

        while(num>0)
        {
            int digit = num%10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if(temp == reverse)
        {
            System.out.println("Palindrome Result Yes");
        }
        else
        {
            System.out.println("Palindrome Result No");
        }
        }
        }
    
    

