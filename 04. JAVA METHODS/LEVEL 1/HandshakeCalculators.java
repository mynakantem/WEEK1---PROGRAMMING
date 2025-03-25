import java.util.Scanner;

public class HandshakeCalculators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        if (numberOfStudents < 2) {
            System.out.println("At least 2 students are required for a handshake.");
        } else {
            int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

            System.out.println("The maximum number of handshakes possible among " + numberOfStudents + " students is: " + maxHandshakes);
        }

        scanner.close();
    }
}
