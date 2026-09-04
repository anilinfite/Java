package Day11;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Login Credentials");
        String username = "Admin";
        String password = "1234";
        if (username.equals("Admin") && password.equals("1234")) 
            {
                System.out.println("Login Successful");
            }
            else
            {
                System.out.println("Login Failed");
            }
    }
}
