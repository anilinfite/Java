package Day24;

public class Node {
    int data;
    Node next;

    public Node list;

    public static void main(String[] args)
    {
        Node newNode = new Node();
        newNode.data =101;
        newNode.next = null;
        System.out.println(newNode.data);
        System.out.println(newNode.next);

        Node secondNode = new Node();
        secondNode.data = 102;
        secondNode.next = null;
        System.out.println(secondNode.data);//102
        System.out.println(secondNode.next);//null
        System.out.println(secondNode.next.data);//null
        System.out.println(secondNode.next.next);//Error
    }
}
