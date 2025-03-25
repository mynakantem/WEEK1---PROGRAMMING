import java.util.Scanner;

public class SumUntilZero { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
	double total = 0.0; //to store sum
	double number;      //to store input
	
	System.out.print("Enter the number (0 to stop)");
	number = scanner.nextDouble();
	
	while(number != 0) {
	total += number;
	System.out.println("Enter another number (0to stop)");
	number = scanner.nextDouble();
	}
	
	System.out.println(("Total sum of the numbers entered:") + total);
	
	scanner.close();
	}
	}
	