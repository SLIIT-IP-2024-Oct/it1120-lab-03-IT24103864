import java.util.Scanner;

public class IT24103864Lab3Q1B {
    public static void main(String[] args) {


       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the total bill amount: ");
       double totalBill = scanner.nextDouble();

       double discount = totalBill * 0.10;

       double amountTopay = totalBill - discount;

       System.out.println("Amount to pay after 10% discount: " + amountTopay);

       scanner.close();
    }
}