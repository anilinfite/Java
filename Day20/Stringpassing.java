package Day20;

public class Stringpassing {

    static void welcome(String name)
    {
        System.out.println("Welcome to " + name);
    }
    public static void main(String[] args)
    {
        String name = "Algorithms";
        welcome(name);
    }
}

// Why when a pass value, original value didn't change? // direct value copy
// why in case of Array (objects) it did? // address copy
// Why java is designed like this? //

// Golden Rules -->
//Primitive are always fixed size values, so copying them is inexpensive (Cheap)
//Objects (Arrays, Strings, Custom Objects) can vary from a few bytes to giga bytes. 
//so java copies only there references not the objects themselfs.

