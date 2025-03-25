import java.util.Scanner;
public class BasicCalculator{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter num1:");
double num1 = scanner.nextDouble();

System.out.print("Enter num2:");
double num2 = scanner.nextDouble();

double Addition = num1 + num2;
double Subtraction = num1 - num2;
double Multiplication = num1 * num2;
double Division = num1 / num2;

System.out.println("The Addition, Subtraction, Multiplication and Division value of 2 numbers:" + Addition + "," + Subtraction + "," + Multiplication + ",and" + Division);

scanner.close();
}
}