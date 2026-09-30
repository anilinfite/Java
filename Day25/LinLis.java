package Day25;

class LinLis {
    Node head;

    class Node
    {
        int data;
        Node next;

        Node (int data)
        {
            this.data = data;
            this.next = null;
        }
    }
        public void insertAtFirst(int data)
        {
            Node newNode = new Node(data);
            if(head == null)
            {
                head = newNode;
            }
                newNode.next = head;
                head = newNode;
        }
            public void insertAtLastEnd(Node head, int data)
            {
                Node lastNode = new Node(data);
                lastNode.data = data;
                lastNode.next = null;
                if(head == null)
                {
                    head = lastNode;
                    return;
                }
                    Node currentNode = head;
                    while(currentNode.next != null)
                    {
                        currentNode = currentNode.next;
                    }
                        currentNode.next = lastNode;


            }
                public void printlist()
                    {
                        if(head == null)
                        {
                            System.out.print("List is empty");
                        }
                            return;
                    }

                    Node currentlastNode = head;
                        {
                            while(currentlastNode != null)
                            {
                                System.out.print(currentlastNode.data + " -> ");
                                currentlastNode = currentlastNode.next;
                            }
                                System.out.print();
                        }
    public static void main(String[] args){

        LinLis List = new LinLis();
        List.insertAtFirst(25);
        List.insertAtFirst(45);
        List.insertAtFirst(67);
        List.insertAtLastEnd(null, 27);
        List.insertAtLastEnd(null, 24);
        List.insertAtLastEnd(null, 32);
        List.printlist();

    }

}
