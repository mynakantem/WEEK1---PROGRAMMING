import java.util.Scanner;
public class SquareSide {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the Perimeter:");
double Perimeter = scanner.nextDouble();

double LengthofSide = Perimeter / 4;

System.out.println("The length of the side is" + LengthofSide + "whose perimeter is" + Perimeter);

scanner.close();
}
}