import javax.swing.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean passwordAccepted = false;
        String pass;
        System.out.println("Enter a password to test its strength.");

        while(!passwordAccepted){
            Scanner key  = new Scanner(System.in);
            pass = key.nextLine();
            passwordAccepted = passwordIsGood(pass);
            if(!passwordAccepted){
                System.out.println("Weak password.  Try another.");
            }
        }
        System.out.println("You're password is strong!");

    }
    public static boolean passwordIsGood(String pass){
        if(pass.length() > 6){
            return true;
        }
        return false;
    }

    public static boolean checkForDigits(String pass){

    }


}
