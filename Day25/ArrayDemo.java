package Day25;

public class ArrayDemo {
    
    public static void main(String[] args){
        MyArray myArray = new MyArray();

        // System.out.println("Initial Array");
        // myArray.printElements();

        System.out.println("After Inserting Value");
        myArray.printElements();

        System.out.println(10);
        System.out.println(20);
        System.out.println(30);
        System.out.println(40);
        System.out.println(50);

        myArray.deleteFromStart();
        myArray.deleteFromEnd();
        myArray.deleteFromAnyPosition(2);
        myArray.printElements();

        // myArray.insertAtStart(10);
        // myArray.printElements();

        // myArray.inserAtENd(20);
        // myArray.printElements();

        // myArray.insertAtanyPosition(3, 25);
        // myArray.printElements();

        // // Invalid Positions
        // myArray.insertAtanyPosition(-1, 99);
        // myArray.insertAtanyPosition(7, 40);
        // System.out.println("Insert inf at Invalid Position");
        // myArray.printElements();

        // //Array is full
        // myArray.inserAtENd(30);
        // myArray.insertAtStart(50);

        // System.out.println("Array");
        // myArray.printElements();
    }
}
