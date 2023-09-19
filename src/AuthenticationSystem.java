import java.util.Scanner;

public class AuthenticationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "patika";
        String password = "java123";

        System.out.print("Enter your username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");

            System.out.print("Do you want to reset your password? (Yes/No): ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("Yes")) {
                System.out.print("Enter your new password: ");
                String newPassword = scanner.nextLine();

                if (!newPassword.equals(enteredPassword)) {
                    password = newPassword;
                    System.out.println("Password has been reset.");
                } else {
                    System.out.println("Password cannot be set to the same value. Please enter a different password.");
                }
            }
        }

        scanner.close();
    }
}
