import java.util.Scanner;
public class PowerOfNumber {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a Positive Number");
int number = scanner.nextInt();

System.out.print("Enter the Power");
int power = scanner.nextInt();

if(number <= 0 || power < 0) {
System.out.println("please enter a valid positive integer");
} else {
int result = 1;
for (int i = 1; i <= power; i++) {
result *= number;
}
System.out.println(number + "^" + power + " = " + result);
}
scanner.close();
}
}