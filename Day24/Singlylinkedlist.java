package Day24;

public class Singlylinkedlist {
    public static void main(String[] args)
    {
        Node head = null;
        //Function Invocation
        head = insertAtStart(100, head); 
        
    }
    //Function Definition
    public static Node insertAtStart(int value, Node currentHead) 
    {
        //Creation of newNode and set the values
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        // Test case 1 head is null or list is empty
        if(currentHead == null)
        {
            return newNode;
        }
        else
        {
            // Test case 2 - list is not empty or there are one or more nodes.
            return newNode;
        }
    }
}
