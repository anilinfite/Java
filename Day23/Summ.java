package Day23;

public class Summ {
    
    // static int findsum(int[] arr)
    // {
    //     int sum = 0;
    //     for(int x : arr)
    //     {
    //         sum += x;
    //         //sum = sum + x;
    //     }
    //     return sum;
    // }
    // public static void main(String[] args)
    // {
    //     int[] arr = {1, 3, 5, 7};
    //     System.out.println(findsum(arr));
    // }

    // static int findMax(int[] arr)
    // {
    //     int max = arr[0];

    //     for(int x : arr)
    //     {
    //         if(x > max)
    //         {
    //             max = x;
    //         }
    //     }
    //     return max;

    // }
    // public static void main(String[] args)
    // {
    //     int[] arr = {55, 125, 854, 1024};
    //     findMax(arr);
    // }


// Search an element in an array // linear search program.
// arr = [10, 20, 30, 40, 50]
// Syso (arr,30) || Is there - boolean 
// Syso (arr, 100)

    static boolean search(int[] arr, int key)
    { 
        for(int x : arr)
            if(x == key)
            {
                return true;
            }
            return false;
    }

    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(search(arr, 30)); // True
        System.out.println(search(arr, 100)); // False
        
    }

}
// for each - read elements sequentialy forward only.
// for loop - full controll (For, Back, skip, jump, modify using index)
// for each is  meant for processing every element, not controlling traversal.

//What can't be done using for each:-
// Reverse traversal
// Access indexes
// Access previous element or next element
// you can't skip specific indices
// you can't jump to a particular position
// you can't swap elements
// you can't sort array
// you can't rotate or reverse array
// you can't modify primitive array elements
// you can't perform indices based algorithms // very very important
// (Bubble sort, Binary Search in these programs we cannot do it)

