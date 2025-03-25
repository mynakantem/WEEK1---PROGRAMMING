import java.util.Scanner;
public class RightToVote {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Please Enter your Age:");
int Age = scanner.nextInt();

if (Age >= 18) {
System.out.println("The person age is" + Age + "and can vote!");
} else {
System.out.println("The person age is" + Age + "and cannot vote");
}

scanner.close();
}
}