import java.util.Scanner;
public class ConvertHeight {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter your height in cm:");
double height = scanner.nextDouble();

double heightininches = height * 0.393701;
double heightinfeet = height * 0.0328084;

System.out.println("Your Height in cm is" + height + "while in feet is" + heightinfeet + " and inches is" + heightininches);

scanner.close();
}
}