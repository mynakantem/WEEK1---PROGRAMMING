import java.util.Scanner;
public class TotalIncome {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter your salary:");
double salary = scanner.nextDouble();

System.out.print("Enter your bonus:");
double bonus = scanner.nextDouble();

double TotalIncome = salary + bonus;

System.out.println("The Salary is INR" + salary + " and bonus is INR" + bonus + ". Hence Total Income is INR" + TotalIncome);

scanner.close();
}
}