import java.util.Scanner;
public class DoubleOperation {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the value of a:");
double a = scanner.nextDouble();

System.out.print("Enter the value of b:");
double b = scanner.nextDouble();

System.out.print("Enter the value of c:");
Double c = scanner.nextDouble();

double result1 = a + b * c;
double result2 = a * b + c;
double result3 = c + a / b;
double result4 = a % b + c;

System.out.println("The results of the Int Oprations are:" + result1 + "," + result2 + "," + result3 + ",and" + result4);

scanner.close();
}
}