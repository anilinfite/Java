package Day24;

public class Singlyll 
{
    public static void main(String[] args)
    {
        Node head =  null;
        printlist(head);

        head = insertAtStart(101, head);
        head = insertAtStart(102, head);
        head = insertAtStart(103, head);
        head = insertAtStart(104, head);
        head = insertAtStart(105, head);
        printlist(head.next);
        
    }
   
        public static Node insertAtStart(int value, Node currentNode)
        {
            Node newNode = new Node();
            newNode.data = value;
            newNode.next = null;

            if(currentNode != null)
              newNode.next = currentNode;
              return newNode;
        }
            static void printlist(Node head)
            {
              Node monkey = head;
              System.out.print("Head" + "->");
              while(monkey != null)
              {
          
                System.out.print(monkey.data + " -> ");
                monkey = monkey.next;
              }
                System.out.println("null");
                
        }
     
      }
    }

    

