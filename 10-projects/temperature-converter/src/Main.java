import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperature;
        double newTemperature;

        System.out.print("Enter temperature: ");
        temperature = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Convert to Celsius or Fahrenheit? (C/F): ");
        String choice = scanner.next().toUpperCase();

        newTemperature = choice.equals("C") ? ((temperature - 32) * 5/9) : ((temperature + 32) * 9/5);
        System.out.printf("%.2f\u00B0%s",newTemperature,choice);
    }
}