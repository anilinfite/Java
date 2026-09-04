package Day10;

public class IncrementDec {
    public static void main(String[] args) {
        int count = 10;
        System.out.println(count--);//10
        System.out.println(count);//9
        System.out.println(count--);//9
        System.out.println(count--);//8

        System.out.println(count++);
        System.out.println(count);
        System.out.println(count++);
        System.out.println(count++);
    }
}
