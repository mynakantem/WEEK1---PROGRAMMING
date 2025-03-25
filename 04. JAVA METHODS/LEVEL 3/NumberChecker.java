import java.util.ArrayList;
import java.util.List;

public class NumberChecker {

    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static boolean isDuckNumber(int number) {
        String numStr = String.valueOf(Math.abs(number));
        return numStr.contains("0");
    }

    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        int power = digits.length;

        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153;  // You can take input from the user

        System.out.println("Number: " + number);
        System.out.println("Count of Digits: " + countDigits(number));

        int[] digitsArray = getDigitsArray(number);
        System.out.print("Digits Array: ");
        for (int digit : digitsArray) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Is Duck Number? " + isDuckNumber(number));
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(number));

        int[] largestElements = findLargestAndSecondLargest(digitsArray);
        System.out.println("Largest Digit: " + largestElements[0]);
        System.out.println("Second Largest Digit: " + largestElements[1]);

        int[] smallestElements = findSmallestAndSecondSmallest(digitsArray);
        System.out.println("Smallest Digit: " + smallestElements[0]);
        System.out.println("Second Smallest Digit: " + smallestElements[1]);
    }
}
