package Day18;

public class Patterns1 {
    public static void main(String[] args)
    {
     int count = 0;
     for(int i=1; i<=5; i++)
        {
            
        for(int j=1; j<=5; j++)
            {
            ++count;
            System.out.print( count+" ");
             ++count;
        }
        System.out.println();
    }  
           
        
   
    }
}
