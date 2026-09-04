package Day13;

public class Equalsprogram
{
    public static void main(String[] args)
    {
        System.out.println("Secanrio 1: Both string literals");
        String s1 = "Java";
        String s2 = "Java";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("Secanrio 2: Both using new");
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println(s3 ==s4);
        System.out.println(s3.equals(s4));

        System.out.println("Secanrio 3: Literals vs new");
        String s5 = "Java";
        String s6 = new String("Java");

        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));

       
    }
}