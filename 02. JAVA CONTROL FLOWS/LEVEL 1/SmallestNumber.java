import java.util.Scanner;
public class SmallestNumber {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter num1:");
double num1 = scanner.nextInt();

System.out.print("Enter num2:");
double num2 = scanner.nextInt();

System.out.print("Enter num3:");
double num3 = scanner.nextInt();

if (num1 < num2 && num1 < num3) {
System.out.println(num1 + "is the smallest number");
} else {
System.out.println(num1 + "isnot the smalles number");
}

scanner.close();
}
}