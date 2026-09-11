package Day20;
import java.util.*;
public class Differentcopies {
    
    String getname()
    {
        return "Algorithms";
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name");
        String num = sc.next();

        Differentcopies D = new Differentcopies();
        String D1 = D.getname();
        System.out.println(D1);

    }
}
