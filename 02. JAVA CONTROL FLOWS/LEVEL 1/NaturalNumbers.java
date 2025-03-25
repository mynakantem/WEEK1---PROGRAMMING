import java.util.Scanner;

public class NaturalNumbers {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the Number:");
int Number = scanner.nextInt();

if (Number >= 0) {
int Sum = Number * (Number + 1) / 2;
System.out.println("The sum of the given number" + Number + "is:" + Sum);
} else {
System.out.println("The number is not a natural number");
}

scanner.close();
}
}


