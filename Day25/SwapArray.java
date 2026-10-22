package Day25;

public class SwapArray {
    char IsNumber = '0';
    char IsUpperCase = 'A';
    char IsLowerCase = 'a';
    int array[] = {'a', 'A', '-', '1', '2', 'b', 'D', '*'};


    public void IsLowerCase()
    {
        System.out.println("Invalid LowerCase Print");
            for(int i = 0; array[i]>='a' && array[i]<='z'; i++)
            {
             if(array[i]>='a' && array[i]<='z') {
                 boolean IsLowerCase = true;
             }
             continue;
            }
    }

    public void IsUpperCase()
    {
        System.out.println("Invalid UpperCase Print");
            for(int i = 0; array[i]>='A' && array[i]<='Z'; i++)
            {
             if(array[i]>='A' && array[i]<='Z') {
                 boolean IsUpperCase = true;
             }
                continue;
            } 
    }

    public void IsNumber()
    {
        System.out.println("Invalid Numbers Print");
            for(int i = 0; array[i]>='0' && array[i]<='9'; i++)
            {
                if(array[i]>='0' && array[i]<='9'){
                    boolean IsNumber = true;
                }
                   continue;
            }
    }

    public static void main(String[] args)
    {
        SwapArray s1 = new SwapArray();
        s1.IsLowerCase();
        s1.IsUpperCase();
        s1.IsNumber();
    }

}
