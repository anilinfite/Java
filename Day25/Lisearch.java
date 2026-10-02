package Day25;

public class Lisearch {

    public static void Linearsearch(int[] array, int key)
    {
        boolean found = false; // key is not found

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == key)
            {
                System.out.println("ELement Found At Index" + " " + i);
                found = true;
                break;
            }
        }
        if(found == false)
        {
            System.out.println("Element not Found");
        }
    }
    public static void main(String[] args)
    {
        int[] array = {10, 20, 30, 40, 50};
        int key = 40;

        Linearsearch(array, key);

    }
}
