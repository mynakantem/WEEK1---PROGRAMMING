import java.util.Scanner;
public class TotalPrice {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the Unitprice:");
double Unitprice = scanner.nextDouble();

System.out.print("Enter the Quantity:");
double Quantity = scanner.nextDouble();

double TotalPurchase = Unitprice * Quantity;

System.out.println(" The Total Purchase price in INR" + TotalPurchase + "if the quantity is" + Quantity + "and Unitprice is INR" + Unitprice);

scanner.close();
}
}