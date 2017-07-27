package core;
import java.io.*;
public class Input_ISR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your first name: ");
        String first_name = br.readLine();
        System.out.print("Enter your last name: ");
        String last_name = br.readLine();
        System.out.println("Your full name is: " + first_name + " " + last_name);
        br.close();
    }
}
