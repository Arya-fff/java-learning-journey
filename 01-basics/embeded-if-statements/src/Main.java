public class Main {
    public static void main(String[] args) {
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if (isStudent){
            if (isSenior){
                System.out.println("You recived a 30% discount");
                price *= 0.7;
            } else {
                System.out.println("You recived a 10% discount");
                price *= 0.9;
            }
        } else if (isSenior){
            System.out.println("You recived a 10% discount");
            price = price * 0.9;
        }

        System.out.printf("The price of a ticket is £%.2f", price);
    }
}