package Day25;

public class MyArray {
        int[] array; // place to store elements
        int length; // total size of the array
        int rightIndex; // pointing at empty box 
    public MyArray(){
        length = 5;
        array = new int[length]; // [0][0][0][0][0] --> intial array
        rightIndex = 0;
    }
    // insert at end
    public void inserAtENd(int value){
        System.out.println("After Inserting End Values");
        if(rightIndex == length)
        {
            System.out.println("Array is Full");
            return;
        }
        array[rightIndex] = value;
        rightIndex++; // after inserting at the end size go increased
    }
    // insert at start
    public void insertAtStart(int value){
        System.out.println("After Inserting Start Values");
        if(rightIndex == length)
        {
            System.out.println("Array is Full");
            return;
        }
        else
        {
            // Shift element one position to right
            for(int i = rightIndex-1; i >= 0; i--)
            {
                array[i+1] = array[i];
            }
        }
            //insert
            array[0] = value;
            rightIndex++;
    }
    //insert at any position
    public void insertAtanyPosition(int position, int value){
        System.out.println("Inserting at any Position");
        if(rightIndex == length)
        {
            System.out.println("Array is Full");
            return;
        }
        if(position < 0 || position > rightIndex)
        {
            System.out.println("Invalid Position");
            return;
        }
            // Shift and insert
            for(int i = rightIndex-1; i >= position; i--)
                {
                    array[i+1] = array[i];
                }        
                array[position] = value;
                rightIndex++;
    }
    // Print Elements
    public void printElements(){
        System.out.println("index\tvalue");
        for(int i = 0; i < length; i++)
        {
            System.out.println(i+"\t"+array[i]);
        }
       System.out.println("Size "+rightIndex);
       System.out.println();
    }  
}
