package Day25;

public class Testpgm {

     int[] a = {10,20,30,40,50};
     int[] array = a;
     
     int[] num = array;
    public static void main(String[] args) {
        
        Testpgm test = new Testpgm();

        //  for (int i = 0; i < test.array.length; i++) {
        //     System.out.println(test.array[i]);
        // }

        for (int i = 0; i < test.num.length; i++)
        {
            System.out.println(test.num[i]);
        }
    }
}
