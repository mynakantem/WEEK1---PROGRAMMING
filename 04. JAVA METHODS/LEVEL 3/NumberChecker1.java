import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberChecker1 {

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

    public static int sumOfDigits(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2); 
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }

    public static int[][] findDigitFrequency(int number) {
        int[] digits = getDigitsArray(number);
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int digit : digits) {
            frequencyMap.put(digit, frequencyMap.getOrDefault(digit, 0) + 1);
        }

        int[][] frequencyArray = new int[frequencyMap.size()][2];
        int index = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            frequencyArray[index][0] = entry.getKey(); 
            frequencyArray[index][1] = entry.getValue(); 
            index++;
        }

        return frequencyArray;
    }

    public static void main(String[] args) {
        int number = 1729; // You can take user input

        System.out.println("Number: " + number);
        System.out.println("Count of Digits: " + countDigits(number));

        int[] digitsArray = getDigitsArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digitsArray));

        System.out.println("Sum of Digits: " + sumOfDigits(number));
        System.out.println("Sum of Squares of Digits: " + sumOfSquaresOfDigits(number));
        System.out.println("Is Harshad Number? " + isHarshadNumber(number));

        int[][] digitFrequency = findDigitFrequency(number);
        System.out.println("Digit Frequency:");
        for (int[] row : digitFrequency) {
            System.out.println("Digit: " + row[0] + " | Frequency: " + row[1]);
        }
    }
}
