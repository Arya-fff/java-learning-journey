import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email address: ");
        String email = sc.nextLine();

        if (email.contains("@")) {
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);
        } else {
            System.out.println("Invalid email address");

        }

    }
}