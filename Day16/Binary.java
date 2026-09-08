package Day16;

public class Binary {
    public static void main(String[] args)
    {
        int n = 10;//ffkjdjdhg

        while (n > 0) 
    {
        int remainder = n % 2;
        System.out.print(remainder);
        n = n / 2;
    }
    }
}
