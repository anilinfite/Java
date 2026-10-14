package Day25;

public class Leetcodepr {
    int even = 0;
    int odd = 0;
    int arr[] = {3, 8, 5, 12, 7};

    public void EvennumberPrinting()
    {
        System.out.println("Even Numbers");
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                even++;
                System.out.println(arr[i] ++);
            }
        }
        System.out.println();
    }                                                       
}



    
    public void OddnumberPrinting()
    {
        System.out.println("Odd Numbers");
        for(int i = 0; i < arr.length; i++)
        {
            
            if(arr[i] % 2 != 0)
            {
                odd++;
                System.out.print(arr[i] + " ");
            }
        }

    }

public static void main(String[] args)
{
  Leetcodepr Lee = new Leetcodepr();
    Lee.EvennumberPrinting();
    Lee.OddnumberPrinting();


}


}
