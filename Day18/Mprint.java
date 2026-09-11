package Day18;

public class Mprint {
    public static void main(String[] args)
    {
        for(char C = 'A'; C <= 'Z'; C++)
        {
            if (C == 'M')
                break;
            System.out.print(C+" ");
        }
    }
}
