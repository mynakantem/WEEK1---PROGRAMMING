import java.util.Scanner;
public class SimpleInterest {
public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);

System.out.print("Enter the Principal:");
double principal = scanner.nextDouble();

System.out.print("Enter the rate:");
double rate = scanner.nextDouble();

System.out.print("Enter the time:");
double time = scanner.nextDouble();

double simpleinterest = (principal * rate * time) / 100;

System.out.println("The Simple Interest of the given principal," + principal + "rate," + rate + "and time" + time + "is:" + simpleinterest);

scanner.close();
}
} 
