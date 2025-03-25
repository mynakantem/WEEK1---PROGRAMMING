import java.util.Scanner; 
public class CharArrayComparision {
public static char[] getCharecters(String text) {
char[] charecters = new char[text.length()];
for(int i = 0; i < text.length(); i++) {
charecters[i] = text.charAt(i);
}
return charecters;
}

public static boolean compareCharArrays(char[] arr1, char[] arr2) {
if (arr1.length != arr2.length) {
return false;
}
for (int i = 0; i < arr1.length; i++) {
if (arr1[i] != arr2[i]) {
return false;
}
}
return true;
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a string:");
String text = scanner.next();
char[] userDefinedChars = getCharecters(text);
char[] builtInChars = text.toCharArray();

boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);

System.out.println("Charecters using user-defined method:");
System.out.println(java.util.Arrays.toString(builtInChars));

System.out.println("Are both charecter arrays equal? " + areEqual);

scanner.close();
}
}