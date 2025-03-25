import java.util.Scanner;

public class RocketLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     System.out.print("Enter the countdown start number: ");
     
	 
	 for ( int counter = scanner.nextInt(); counter >=1 ; counter --) { 
	 System.out.println(counter);
	 }
	 
	 System.out.println("LiftOff!!");
	 
	 scanner.close();
	 }
}