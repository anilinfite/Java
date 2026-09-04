package Day6;
/*public class Widening {

    //Demonstration for Typecasting
    //Widening  put smaller data into larger container
    //Class widening Typecasting
    public static void main(String[] args) {
        int num = 100;
        int result = num;

    System.out.println(result);
    }
}*/

//Narrowing -- put larger data into smaller data type.


public class Widening {

    public static void main(String[] args) {
        int num = 100;
        byte result = (byte) num;

    System.out.println(result);
    }
}