import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Weight Conversion Program");

        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter weight in lbs: ");
            double lbs = scanner.nextDouble();
            System.out.printf("The new weight in kgs is: %.3f", lbs * 0.453592);

        } else if (choice == 2) {
            System.out.print("Enter weight in kgs: ");
            double kgs = scanner.nextDouble();
            System.out.printf("The new weight in lbs is: %.3f", kgs * 2.20462);

        } else {
            System.out.println("Invalid Choice");
        }

    }
}