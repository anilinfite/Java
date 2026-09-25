package Day24;
class Qstn
{
    static int evencount(int ... nums)
    {
        int count = 0;
        for(int n : nums)
        {
            if(n % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        System.out.println("Even numbers are:"+ evencount(10,20,30,40,50));
    }
}