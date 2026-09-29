package Day24;

class LL {
    Node head;

    class Node{
    int data;
    Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
        public void insertAtFirst(int data) {
            Node newNode = new Node(data);
            if(head == null){
                newNode = head;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
            public void printlist(){
                if(head == null){
                    System.out.print("List is Empty");
                    return;
                } 
                Node currentNode = head;
                while(currentNode != null) {
                    System.out.println(currentNode.data + " -> ");
                    currentNode = currentNode.next;
                }
                    System.out.println("null");
            }
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        list.printlist();
    }
}

