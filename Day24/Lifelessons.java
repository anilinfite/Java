package Day24;

class Lifelessons {
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

    public Node testDeleteOperations(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        return head.next;
    }

    public Node testDeleteAtEnd(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node lastButOne = head;
        while (lastButOne.next.next != null) {
            lastButOne = lastButOne.next;
        }
        lastButOne.next = null;
        return head;
    }

    public Node deleteKeyNode(Node head, int key) {
        if (head == null) {
            return null;
        }
        if (head.next == null && head.data == key) {
            return null;
        }

        Node keyNode = head;
        Node prevNode = null;

        while (keyNode != null) {
            if (keyNode.data == key) {
                break;
            }
            prevNode = keyNode;
            keyNode = keyNode.next;
        }

        if (keyNode == null) {
            return head;
        }

        if (prevNode == null) {
            return head.next;
        }

        prevNode.next = keyNode.next;
        return head;
    }

    public void printlist() {
        if (head == null) {
            System.out.print("List is Empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
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
        list.insertAtFirst(40);
        list.insertAtFirst(50);
        list.insertAtFirst(60);
        list.insertAtFirst(70);

        list.head = list.testDeleteAtEnd(list.head);
        list.printlist();
        list.testDeleteOperations(list.head);
    }
}

