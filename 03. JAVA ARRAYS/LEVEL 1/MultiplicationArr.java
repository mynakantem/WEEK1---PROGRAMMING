import java.util.Scanner;
public class MultiplicationArr {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int[] arr = new int[10];

System.out.print("Enter the number to generate its multiplication table:");
int number = scanner.nextInt();

for (int i=0; i<10; i++) {
arr[i] = number * (i+1);
}

for (int i=0; i<10; i++) {
System.out.println("The multiplication table of" + i+1 + "is:" + arr[i]);
}
scanner.close();
}
}