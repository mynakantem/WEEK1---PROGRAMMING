import java.util.Scanner;
public class DivisibleChecker {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the number:");
int number = scanner.nextInt();

double divisiblity = number % 5;

if (divisiblity == 0) {
System.out.println("The given number" + number + "is divisible by 5");
} else {
System.out.println("Not divible by 5");
}

scanner.close();
}
}