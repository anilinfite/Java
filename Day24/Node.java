package Day24;

public class Node {
    int data;
    Node next;

    public Node list;

    public static void main(String[] args)
    {
        Node firstNode = new Node();
        firstNode.data =101;
        firstNode.next = null;
        System.out.println(firstNode.data);
        System.out.println(firstNode.next);

        Node secondNode = new Node();
        secondNode.data = 102;
        secondNode.next = null;
        System.out.println(secondNode.data);//102
        System.out.println(secondNode.next);//null
        // next is null, so its fields cannot be accessed.

        Node thirdNode = new Node();
        thirdNode.data = 103;
        thirdNode.next = null;
        System.out.println(thirdNode.data);
        System.out.println(thirdNode.next);
        // next is null, so its fields cannot be accessed.

        firstNode.next = thirdNode;
        secondNode.next = thirdNode;

        Node head = new Node();
        Node lastNode = secondNode;
        Node temp = head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
            temp.next=lastNode;
    }
}
