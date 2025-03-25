import java.util.Scanner;
public class SmallestNumbers {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter num1:");
double num1 = scanner.nextInt();

System.out.print("Enter num2:");
double num2 = scanner.nextInt();

System.out.print("Enter num3:");
double num3 = scanner.nextInt();

if (num1 > num2 && num1 > num3) {
System.out.println(num1 + "is the largest of the three numbers");
} else if (num2 > num3 && num2 > num1) {
System.out.println(num2 + "is the largest of the three numbers");
} else {
System.out.println(num3 + "is the largest of the three numbers");
}

scanner.close();

}
}
