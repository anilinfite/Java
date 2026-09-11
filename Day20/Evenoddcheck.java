package Day20;

import java.util.*;

class Evenoddcheck {
    boolean Evenorodd(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value ");
        int num = sc.nextInt();

        Evenoddcheck obj = new Evenoddcheck();
        boolean result = obj.Evenorodd(num);
        System.out.println(result);
    }
}
