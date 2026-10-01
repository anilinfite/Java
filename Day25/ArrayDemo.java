package Day25;

public class ArrayDemo {
    
    public static void main(String[] args){
        MyArray myArray = new MyArray();

        System.out.println("Initial Array");
        myArray.printElements();

        myArray.insertAtStart(10);
        myArray.printElements();

        System.out.println("After Inserting Start Values");

        myArray.inserAtENd(20);
        myArray.printElements();

        System.out.println("After Inserting End Values");

        myArray.insertAtanyPosition(3, 25);
        myArray.printElements();

        System.out.println("Invalid Positions should be display");
        // Invalid Positions
        myArray.insertAtanyPosition(-1, 99);
        myArray.insertAtanyPosition(7, 40);
        System.out.println("Insert inf at Invalid Position");
        myArray.printElements();

        //Array is full
        myArray.inserAtENd(30);
        myArray.insertAtStart(50);

        System.out.println("Array");
        myArray.printElements();
    }
}
