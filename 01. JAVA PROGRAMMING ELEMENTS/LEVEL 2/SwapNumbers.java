import java.util.Scanner;
public class SwapNumbers {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the first number:");
double firstnum = scanner.nextDouble();

System.out.print("Enter the second number:");
double secondnum = scanner.nextDouble();

double temp = firstnum;
firstnum = secondnum;
secondnum = temp;

System.out.println("The Swapped numbers are" + firstnum + "and" + secondnum);

scanner.close();
}
}