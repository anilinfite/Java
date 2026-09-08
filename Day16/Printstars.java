package Day16;

public class Printstars {
    public static void main(String[] args)
    {
        for(int i = 1; i <= 10; i++)
        {
            if(i == 4)
                break;
            //System.out.print("*"+" "); // * * *
            //System.out.print("A"+" "); // A A A 
            System.out.print(i+" "); //1 2 3
        }
    }
}
