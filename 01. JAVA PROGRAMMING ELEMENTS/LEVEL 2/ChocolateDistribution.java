import java.util.Scanner;
public class ChocolateDistribution {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter total NoOfChocolates:");
int NoOfChocolates = scanner.nextInt();

System.out.print("Enter total NoOfChildren:");
int NoOfChildren = scanner.nextInt();

int ChocolatesPerChild = NoOfChocolates / NoOfChildren;
int RemainingChocolates = NoOfChocolates % NoOfChildren;

System.out.println("The NoOfChocolates each child gets is" + ChocolatesPerChild + "and the No.of Remaining chocolates are" + RemainingChocolates);

scanner.close();
}
}