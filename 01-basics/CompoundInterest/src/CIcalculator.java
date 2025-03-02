import java.util.Scanner;

public class CIcalculator {
    private final Scanner scanner;
    private double principal;
    private double interest;
    private int times;
    private int year;

    public CIcalculator() {
        this.scanner = new Scanner(System.in);
    }

    public void getInput(){
        enterPrincipal();
        enterInterest();
        enterTimes();
        enterYear();
    }

    public void enterPrincipal() {
        System.out.print("Enter principal: ");
        principal = scanner.nextDouble();
    }

    public void enterInterest() {
        System.out.print("Enter the interest rate(%): ");
        interest = scanner.nextDouble();
    }

    public void enterTimes(){
        System.out.print("Enter the # of times the principal is compounded per year: ");
        times = scanner.nextInt();
    }

    public void enterYear() {
        System.out.print("Enter the # of years: ");
        year = scanner.nextInt();
    }

    public void calculate() {
        double x = (1 + interest / 100 * times);
        double amount = (principal * Math.pow(x, year));
        System.out.printf("The amount after %d years is £%.2f",year, amount);
    }


}
