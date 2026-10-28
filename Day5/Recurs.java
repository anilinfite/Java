package Day5;

public class Recurs {
    public static void fun(int n){
        if( n > 0)
        {
            System.out.println(n);
            fun(n-1);
        }
    }

    public static void main(String[] args){
        fun(20);
    }

}
