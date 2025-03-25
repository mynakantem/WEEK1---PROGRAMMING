public class NullPointer {
public static void generateException() {
String text = null;
System.out.println("Length of text: " + text.length());
}

public static void handleException() {
String text = null;
try {
    System.out.println("Length of text:" + text.length());
	} catch (NullPointerException e) {
	System.out.println("Exception caught:" + e);
	}
}

public static void main(String[] args) {

try {
    generateException();
	} catch (Exception e) {
	System.out.println("Exception in generateException(): " + e);
	}
	
	System.out.println("\nNow handling the exception safely:\n");
	
	handleException();
	}
}