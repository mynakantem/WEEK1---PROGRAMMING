import java.util.Scanner;
public class PrintQuotient {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);


System.out.print("Enter the num1:");
double num1 = scanner.nextDouble();

System.out.print("Enter the num2:");
double num2 = scanner.nextDouble();

double Quotient = num1 /num2;
double Remainder = num1 % num2;

System.out.println("The Quotient is" + Quotient + " and Remainder is" + Remainder + "of two numbers" + num1 + "and" + num2);

scanner.close();
}
}