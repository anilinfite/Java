package Day17;

public class LoopinsLoop {
    public static void main(String[] args)
    {

        // For loop inside For Loop Programs

        // for(int i = 1; i <= 5; i++)
        // {
        //     for(int j = 1; j <= 5; j++)
        //     {
        //         System.out.print(i+j + " ");
        //     }
        //     System.out.println();
        // }

        // int count = 0;
        // for(int i = 1; i <= 5; i++)
        // {
        //     for(int j = 1; j <= 5; j++)
        //         ++count;
        //     System.out.print(count + " ");
        // }
        // System.out.print( " ");

        // int count = 0;
        // for(int i = 1; i <= 5; i++)
        // {
        //     for(int j = 1; j <= 5; j++)
        //         ++count;
        //     System.out.print(count+ " ");
        // }
        // System.out.println(" ");

        // for(int i = 1; i <= 5; i++)
        // {
        //     for(int j = 1; j <=i; j++)
        //     {
        //         //System.out.print(j + " ");
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // While inside While loop Program

        // int i = 1;
        // while( i <= 3 )
        // {
        //     int j = 1;

        //     while(j <= 4)
        //     {
        //         System.out.print("* ");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

        // Dowhile Loop inside Dowhile Loop Programs

        // int i = 1;
        // do
        // {
        //     int j = 1;
        //     do
        //     {
        //         System.out.print("* ");
        //         j++;
        //     }while( j <= 4);
        //     System.out.println();
        //     i++;
        // }while( i <=3 );

        // For loop inside While Loop Program

        int i = 1;
        while( i<=3 )
        {
            for(int j = 1; j <= 4; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            i++;
        }
    }
}
