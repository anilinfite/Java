package Day7;

public class Challenges {
     
    public static void main(String[] args)
    {
        /*byte a = 10;// a has 10
        byte b = 20;// b has 20

        b = a; // 10 goes to b

        System.out.println(a); //10
        System.out.println(b);// 10*/
       
        int a = 10; // a has 10
        int b = 20; // b has 20
        int c = a; // a value goes to c now c value is 10

        a = b; // b value has 20 now it goes to a 
        b = c; // c valye has 10 now goes to b now b value is 10

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println();

        byte x = 126; // x has 126 value
        System.out.println(x); // 126
        x++; // x has +1 added / 126+1 = 127
        System.out.println(x); // 127
        x++; // x has incremented 127+1 = -128 because it is byte code  // -128 to 127 value
        System.out.println(x);
    }
        
}
