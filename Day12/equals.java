package Day12;

public class equals {
    public static void main(String[] args)
    {
        int num1 = 10; // values
        int num2 = 10;

      //  if(num1 == num2) // == works for print data types
       // if(num1.equals(num2))// this is object invoking
       /* if(num1 == num2)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        } */

        int day = "Saturday";
        String day = "Saturday";

        //if (day == "Saturda") // incomptible operands string int
        if(day.equals(day))// works for objects 
    }
}
