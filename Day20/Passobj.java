package Day20;

public class Passobj {
    
    static void update(int b[]) // 10, 20, 30, 40
    {
        b[0] = 100;
        System.out.println("Inside update:" + b[0]); //100
    }
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40}; // 1000
        System.out.println("Before Method Call:" + a[0]); // 10

        update(a);

        System.out.println("After call:" + a[0]); // 100
    }
}


// Activities --> Pass by values --> Trace it.
// Array Values -- > Trace it.