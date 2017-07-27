package core;

import java.io.*;
import java.util.Arrays;

public class Input_Console_Password {
    public static void main(String[] args) {

        Console c = System.console();

        if (c == null) {System.err.println("Console is not availble"); System.exit(2);}

        char[] password1 = c.readPassword("Password: ");
        char[] password2 = c.readPassword("Confirm password: ");
        System.out.println(Arrays.equals(password1,password2) ? "Password match" : "Password don't match");
        System.out.println("Password: " + String.valueOf(password1));
        System.out.println("Confirm password: " + String.valueOf(password2));
    }
}
