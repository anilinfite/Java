package Day10;

public class Bitwise {
    public static void main(String[] args) {
        int x = 10;
        int y = 6;
        int z;
        System.out.println("And"+ (x & y));
        System.out.println("OR"+ (x | y));
        System.out.println("Ex-or"+ (x ^ y));
        System.out.println("Not"+ (~x));
        System.out.println("Not Y"+ (~y));

        System.out.println();

        System.out.println("Left Shift");
        int a = 10;
        System.out.println("Shift by 1"+ (a << 1));
        System.out.println("Shift by 2 places"+ (a << 2));
        System.out.println("Shift by 3 places"+ (a << 3));

        System.out.println();

        System.out.println("Unsigned Right Shift");
        int b = -10;
        System.out.println("Shift by 1"+ (b >> 1));
        System.out.println("Shift by 2 places"+ (b >> 2));
        System.out.println("Shift by 3 places"+ (b >> 3));

        System.out.println();

        System.out.println("Unsigned Right Shift");
        int f = -10;
        System.out.println("Shift by 1"+ (b >>> 1));
        System.out.println("Shift by 2 places"+ (b >>> 2));
        System.out.println("Shift by 3 places"+ (b >>> 3));
    }

}
