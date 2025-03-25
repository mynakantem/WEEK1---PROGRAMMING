import java.util.Scanner;
public class TemperatureConversion {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter TempinCelsius:");
double TempinCelsius = scanner.nextDouble();

double TempinFahrenheit = (TempinCelsius * 9 / 5) + 32;

System.out.println("The" + TempinCelsius + "celsius is" + TempinFahrenheit + "fahrenheit");

scanner.close();
}
}  