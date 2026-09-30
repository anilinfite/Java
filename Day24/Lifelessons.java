package Day24;

class Lifelessons {
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
                head = newNode;
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
                    System.out.print(currentNode.data + " -> ");
                    currentNode = currentNode.next;
                }
                    System.out.print("null");
            }
    public static void main(String[] args) {
        Lifelessons list = new Lifelessons();
        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        list.printlist();
    }
}

