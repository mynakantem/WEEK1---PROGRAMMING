import java.util.Scanner;
public class PoundToKilo {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the weight (in pounds):");
double weightinpound = scanner.nextDouble();

double weightinkilo = weightinpound * 2.2;

System.out.println("The weight of the person in pound is" + weightinpound + "and in kg is" + weightinkilo);

scanner.close();
}
}