import java.util.Scanner;
public class KilometertoMiles {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the kilometer:");
double kilometer = scanner.nextDouble();

double miles = kilometer * 0.621371;

System.out.println("The given kilometer" + kilometer + "to miles is:" + miles);

scanner.close();
}
}
