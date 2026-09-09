package Day19;
class Method
{
    // // Demo of instance method (cretae object and access)
    // int max(int x, int y)
    // {
    //     if(x > y)
    //         return x;
    //     else
    //         return y;
    // }

    // public static void main(String[] args)
    // {
    //     int a = 10, b = 15;

    //     Method m = new Method();

    //     int c = m.max(a, b);

    //     System.out.println(c);
    // }


    //object creation program
    //     void greet()
    //     {
    //     System.out.println("Hello");
    //     }

    //     //2 Args but No return
    //      void printsum(int a, int b) // a = 10, b = 20, 
    //     {
    //         System.out.println("sum="+(a+b)); //30
    //     }

    //     //3 No args but return
    //      int getNumber()
    //     {
    //         return 100;
    //     }

    //     //args and return

    //      int max(int x, int y)
    //     {
    //         if(x > y)
    //             return x;
    //         else 
    //             return y;
    //     }
    // public static void main(String[] args)
    // {
    //     //1
    //     Method m = new Method();
    //     m.greet();

        
    //     //2
    //     Method m1 = new Method();
    //     m1.printsum(10, 20); 


    //     //3
    //     Method m2 = new Method();
    //     int num = m2.getNumber(); 
    //     System.out.println(num);


    //     //4
    //     Method m3 = new Method();
    //     int largest = m3.max(25, 40); 
    //     System.out.println(largest);

        
    // }


        //One object create multiple methods calling

        void greet()
        {
        System.out.println("Hello");
        }

        //2 Args but No return
         void printsum(int a, int b) // a = 10, b = 20, 
        {
            System.out.println("sum="+(a+b)); //30
        }

        //3 No args but return
         int getNumber()
        {
            return 100;
        }

        //args and return

         int max(int x, int y)
        {
            if(x > y)
                return x;
            else 
                return y;
        }

        public static void main(String[] args) 
        {
            Method m = new Method();

            //1
            m.greet();

            //2
            m.printsum(10, 20);

            //3
            m.getNumber();
            int num = m.getNumber();
            System.out.println(num);
            
            //4
            m.max(10, 15);
            int largest = m.max(25, 40); 
            System.out.println(largest);

        }
}