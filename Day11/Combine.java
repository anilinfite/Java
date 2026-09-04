package Day11;

public class Combine {
    public static void main(String[] args)
    {
        System.out.println("Combine conditions using logical operator");

        int age = 25;
        boolean citizen = true;

        if(age >= 18 && citizen)
        {
            System.out.println("Elgible");
        }
        else
        {
            System.out.println("Not Elgible");
        }

    }
}
