import java.util.Scanner;
public class UniversityFees {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the Fee:");
double Fee = scanner.nextDouble();

System.out.print("Enter the DiscountPercentage");
double DiscountPercentage = scanner.nextDouble();


double discountamount = (Fee * DiscountPercentage) / 100;
double finalamount = Fee - discountamount;

System.out.println("The discountamount is INR:" + discountamount + "and final discounted fee is INR:" + finalamount);

scanner.close();

}
}