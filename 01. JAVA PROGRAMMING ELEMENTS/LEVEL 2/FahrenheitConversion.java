import java.util.Scanner;
public class FahrenheitConversion {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter TempinFahrenheit:");
double TempinFahrenheit = scanner.nextDouble();

double TempinCelsius = (TempinFahrenheit - 32) * 5 / 9;

System.out.println("The" + TempinFahrenheit + "fahrenheit is" + TempinCelsius + "celsius");

scanner.close();
}
}  