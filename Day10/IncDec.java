package Day10;

public class IncDec {
    public static void main(String[] args)
    {
        int count = 10;
        System.out.println(count++); //10
        System.out.println(count); //11
        System.out.println(count++); //11
        System.out.println(count++); //12
        System.out.println(count++); //13

        System.out.println();

        System.out.println(count--); //14
        System.out.println(count); //13
        System.out.println(count--); //12
        System.out.println(count--); //11

        System.out.println();

        System.out.println(count++); //12
        System.out.println(count); //12 
        System.out.println(count++); //13

        System.out.println();

        System.out.println(count--); //12
        System.out.println(count);  //12
        System.out.println(count--); //12

        System.out.println();

        int store = count;
        store++;
        System.out.println(store);

        int count1 = 12;
        int count2 = count1++;
        System.out.println(count2);
        System.out.println(count1);

        int a = 13;
        int b = ++a;
        System.out.println(b);
        System.out.println(a);

        // Behaviour in expression
        int c = 10;
        System.out.println(c++ + 5);
        System.out.println(c);
        System.out.println(++c + 5);
        System.out.println(c);

        //confusing behaviour in expression
        System.out.println("Confusing Behiavour in Expression");
        int num = 10;
        System.out.println(num++ + ++num);

        System.out.println();

        int num1 = 11;
        System.out.println(num1++ + num1++);

        System.out.println();

        //Substraction
        int num2 = 12;
        System.out.println(num2++ - ++num2); // 12+1=13 - 1+14=15 / 13-15=-2

        int num3 = 20;
        System.out.println(++num3 + --num3); // 1+20=21 + -1+21=20 / 21+20=41

        System.out.println();

        int d = 5;
        int e = 10;
        System.out.println(d++ + ++e);
        System.out.println(d);
        System.out.println(e);

        int x = 4;
        System.out.println();

        //Give 2 easy, 2 medium and 6 tough questions // ask ChatGPT these kind of questions.

    }
}
