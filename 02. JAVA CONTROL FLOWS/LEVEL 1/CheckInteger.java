import java.util.Scanner;
public class CheckInteger {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Please Enter the number:");
int number = scanner.nextInt();

if (number > 0) {
System.out.println("The number is positive");
} else if (number < 0) {
System.out.println("The number is negative");
} else {
System.out.println("The number is Zero");
}

scanner.close();
}
}

