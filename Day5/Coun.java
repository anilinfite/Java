package Day5;

public class Coun {
    public static int count;

    public static void fun(int n)
    {
        if(n > 0)
        {
            fun(n-1);
            System.out.println(n);
            count++;
        }
    }
    public static void main(String[] args){
        fun(20);
    }
}
