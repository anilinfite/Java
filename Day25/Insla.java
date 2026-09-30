package Day25;

class Insla {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
        public void insertAtEnd(int data)
        {
            Node newNode = new Node(data)
            if(head == null)
                newNode = lasthead;
                return;
            newNode.next = lasthead;
            lasthead = newNode;
        }

        




    public static void main(String[] args)
    {
        Insla naam = new Insla();

    }
    
}
