package Day13;

public class LoopPg {
    public static void main(String[] args)
    {
        //step forward by 2 odd numbers
       /*for(int index = 1; index <=10; index+=2)// index = index + 2
        {
            System.out.println(index); // 1, 3, 5, 7, 9
        } */

        //step forward by 2 even numbers
        /*for(int index = 0; index <=10; index+=2)//index = index + 2
        {
            System.out.println(index);
        }*/

        //step backward by 2 odd numbers
        /*for(int index = 10; index >=1; index-=2)
        {
            System.out.println(index);
        }*/

        //step backward by 2 even numbers
        /*for(int index = 10; index >=0; index-=2)
        {
            System.out.println(index);
        }*/

        
        /*for(int index = 10; index >=1; index-=2)
        {
            System.out.println(index);
        }*/

        //others value starts from zero // starts from negative numbers

       // infinite
      /*for(int i = 1; i<=5; i++)
        {
            System.out.println(i);
        }*/


       /*for(int i = 10; i>=1; i--)
       {
        System.out.println(i);
       }*/
      
        //step forward by 2 print odd numbers
       /*for(int i = 1; i<=10; i+=2)
        {
            System.out.println(i);
        }*/

        //Beginner mistakes
        // 1) for(int i =5; i>=1; i++);
        // 2) for (int i = 5; i>=1 i++)
        // 3) for(int i = 1; i=5; i++);
        // 4) 

        //Actvities
        // increment by 3
        // decrement by 5
        // reverse alphabets
        // print 1 to 100
        // print multiples of 5
        // print squaes of numbers --> 100 2^8
        // cubes print - 10
        // sum of first N numbers

        // write golden rules.
        //1. initilize always
        //2. condition checked
        //3. code executed
        //4. update
        //5. condition check and executed
        //6. incorrect updataion or no updation leads to infinte loop
        //7. there three parts
        //8. 

        for(int index = 2; index <=10; index++) 
        {
            System.out.println("index "+ index*index);
        }
        
    }
}
