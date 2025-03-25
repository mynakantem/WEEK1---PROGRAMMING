import java.util.Scanner;
public class NumberCheckArr {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int[] numbers = new int[5];

System.out.print("Enter the numbers:");
for(int i = 0; i<5; i++) {
numbers[i] = scanner.nextInt();
}
for(int i =0; i<5; i++) {
if (numbers[i] > 0) {
if (numbers[i] % 2 == 0) {
System.out.println(numbers[i] + "is positive and even");
} else {
System.out.println(numbers[i] + "is positive and odd");
} 
} else if (numbers[i] < 0) {
System.out.println(numbers[i] + "is negative");
} else {
System.out.println(numbers[i] + "is zero");
}
}

int first = numbers[0];
int last = numbers[4];

System.out.println("The comparision between first and last element");
if(first>last){
System.out.println(numbers[0] + "is greater than" + numbers[4]);
} else if(first<last) {
System.out.println(numbers[0] + "is lesser than" + numbers[4]);
} else {
System.out.println(numbers[0] + "and" + numbers[4] + "are equal");
}

scanner.close();

}
}



