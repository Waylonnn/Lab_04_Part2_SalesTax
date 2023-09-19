import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double total;
        int price;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price of item: ");
        price = scan.nextInt();
        total = (price * 1.05);
        System.out.println("New price after sales tax: $" + total);
    }
}