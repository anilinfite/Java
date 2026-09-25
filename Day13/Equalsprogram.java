package Day13;

public class Equalsprogram
{
    // public static void main(String[] args)
    // {
    //     System.out.println("Secanrio 1: Both string literals");
    //     String s1 = "Java";
    //     String s2 = "Java";

    //     System.out.println(s1 == s2);
    //     System.out.println(s1.equals(s2));

    //     System.out.println("Secanrio 2: Both using new");
    //     String s3 = new String("Java");
    //     String s4 = new String("Java");

    //     System.out.println(s3 ==s4);
    //     System.out.println(s3.equals(s4));

    //     System.out.println("Secanrio 3: Literals vs new");
    //     String s5 = "Java";
    //     String s6 = new String("Java");

    //     System.out.println(s5 == s6);
    //     System.out.println(s5.equals(s6));

       
    // }

    // public static void main(String[] args)
    // {
    //     int arr[] = new int[5];
    //     // int arr[] = {10, 20, 30, 40};
    //     for(int i=0; i<arr.length; i++)
    //     {
    //       //  arr[2]=100;
    //         System.out.println(arr[i]);
    //     }

    // }

    //First Function
    static void PrintLefttoRight(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + "->");
        }
        System.out.println();
    }
    
    //Second Function
    static void PrintRighttoLeft(int[] arr)
    {
        for(int i=arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i] + "<-");
        }
                System.out.println();
    }

    //Third Function
    static void PrintTwoPiontersmeetatcenterpoint(int[] arr)
    {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right)
        {
            System.out.println(arr[left] + " -> " + arr[right] + " <- ");
            left++;
            right--;
        }
    }

    //Fourth Function
    static void PrintTwoPointersaregoingoutfromtheStart(int[] arr)
    {
        int left = 0;
        int right =arr.length-1; 
    }
        public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            PrintLefttoRight(arr);
            PrintRighttoLeft(arr);
            PrintTwoPiontersmeetatcenterpoint(arr);
            PrintTwoPointersaregoingoutfromtheStart(arr);
    }
}