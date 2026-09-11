package Day20;

public class Methodoverloading {

    int max(int x, int y)
    {
        if(x > y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }

    // when int is not calledd this will be called - widening
    float max(float x, float y) // parameters cannot be same
        {
            if(x > y)
            {
                return x;
            }
            else
            {
                return y;
            }
        }

    int max(int x, int y, int z)
    {
        if(x > y && x >= z)
        {
            return x;
        }
        else if(y >= x && y >= z)
        {
            return y;
        }
        else
        {
            return z;
        }
        
    }
    public static void main(String[] args)
    {
        
        Methodoverloading m = new Methodoverloading();
        System.out.println(m.max(10, 20));
        System.out.println(m.max(12f, 15f));

    }
}


// Activities
// byte byte
// (Long x, Long y)
//Double, Double
// Compilation Error --> int, int --> duplicate, obj.max(10);, obj.max(1,2,3,4);

//Method Overloading --> Don't forget lines below given

//Exact match is always preferred
//if no exact match, widening is preferred
//if no compatible overload existance the compiler reports error.
//Method overloading is decided not on the data type of the method but on 1. No of Parameters 2. Types of Parameters

//Different methods are called depending on the parameters this behaviour is called ?? --> Polymarphism

// For integer Literals suitable method is float.
// We don't have byte literalls
//which means float will work for --> whom--> integer Method.

//Activitiy

// Force to call byte method.
// Force to call double method.

//