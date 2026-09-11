package Day20;

public class Manymethods {

    static void Basic()
    {
        System.out.println("Basic Salary");
    }
    
    static void PF()
    {
        Basic();
        System.out.println("PF Deduction");
    }

    static void DA()
    {
        PF();
        System.out.println("DA Done");
    }    
    static void HRA()
    {
        DA();
        System.out.println("HRA Done");

    }

    static void Tax()
    {
        HRA();
        System.out.println("TAX Done");
    }
    
       
    static void Salary()
    {
        Tax();
        System.out.println("Full Salary");

    }

    public static void main(String[] args)
    {
        Salary();
    }
}

