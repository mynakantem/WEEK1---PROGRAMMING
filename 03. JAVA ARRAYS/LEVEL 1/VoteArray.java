import java.util.Scanner;
public class VoteArray {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int[] arr = new int[10];

System.out.print("Enter the age:");
for(int i =0; i<10; i++){
arr[i] = scanner.nextInt();
}

for (int i=0; i<10;i++) {
if(arr[i]<0) {
System.out.println("Invalid Age");
} else if(arr[i] >= 18) {
System.out.println("The student with the age" + arr[i] + "can vote!");
} else {
System.out.println("The student with the age" + arr[i] + "cannot vote");
}
}
scanner.close();

}
}
