package Day19;

public class StaticPgm {

    // Display Hello Java using static key word

    // static void display()
    // {
    //     System.out.println("Hello Java");
    // }
    // public static void main(String[] args)
    // {
    //     display();
    //     display();
    // }


    //Demo of non-void return type

    // static int max(int x, int y) // x = 10, y = 15 receive data --formal parameters
    // {
    //     if(x > y) /// 10 > 15
    //         return x; // 
    //     else
    //         return y;
    // }

    // // Scope Checking
    // //S.o.p(a)// a is not this method


    // public static void main(String[] args)
    // {
    //     int a = 10, b = 15; // a = 10, b = 15, --Send data
    //     int c = max(a, b);
    //     System.out.println(c);
    // }

    //1 No arguments. No return

        //1 No arguments, No return
         static void greet()
        {
        System.out.println("Hello");
        }

        //2 Args but No return
        static void printsum(int a, int b) // a = 10, b = 20, 
        {
            System.out.println("sum="+(a+b)); //30
        }

        //3 No args but return
        static int getNumber()
        {
            return 100;
        }

        //args and return

        static int max(int x, int y)
        {
            if(x > y)
                return x;
            else 
                return y;
        }
    public static void main(String[] args)
    {
        //1
        greet();

        System.out.println();

        //2
        printsum(10, 20); 

        System.out.println();

        //3
        int num = getNumber(); 
        System.out.println(num);

        System.out.println();

        //4
        int largest = max(25, 40); 
        System.out.println(largest);
    }
    
}
