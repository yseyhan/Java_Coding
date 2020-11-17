package ScannerWithStrings;
import java.util.Scanner;
public class SecondScanner {
    public static void main(String[] args) {
/*
- Place an order
    - Ask the user the enter the product name (String, multiple words)
    - Ask the user to enter the price (double)
    - Ask the user to enter the quantity(int)
    - Ask the user to enter their full name (String, multiple word)
    - Print in the following format:
        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.
 */

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a product name");
        String productName = scan.nextLine();
        System.out.println("Enter a price");
        double price=scan.nextDouble();
        System.out.println("Enter a quantity");
        int quantity=scan.nextInt();
        scan.nextLine();//this is added to absorb the enter key

        System.out.println("Enter Their full name");
        String fullName= scan.nextLine();
        scan.close();



















    }

}
