package Day25;

 class Testing {
    

     Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void insertAtLastEnd(int data) {

        Node lastNode = new Node(data);

        if (head == null) {
            head = lastNode;
            return;
        }

        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = lastNode;
    }

    public void printlist() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currentNode = head;

        while (currentNode != null) {

            System.out.print(currentNode.data);

            if (currentNode.next != null) {
                System.out.print(" -> ");
            }

            currentNode = currentNode.next;
        }

        System.out.print(" -> " + "null");
    }

    public static void main(String[] args) {

        Testing list = new Testing();

        list.insertAtFirst(25);
        list.insertAtFirst(45);
        list.insertAtFirst(67);

        list.insertAtLastEnd(27);
        list.insertAtLastEnd(24);
        list.insertAtLastEnd(32);

        list.printlist();
    }
}

