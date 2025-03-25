import java.util.ArrayList;
import java.util.List;

public class NumberChecker4 {

    public static int[] findFactors(int number) {
        List<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorsList.add(i);
            }
        }
        return factorsList.stream().mapToInt(i -> i).toArray();
    }

    public static int findGreatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 2]; 
    }

    public static int sumOfFactors(int number) {
        int sum = 0;
        for (int factor : findFactors(number)) {
            sum += factor;
        }
        return sum;
    }

    public static long productOfFactors(int number) {
        long product = 1;
        for (int factor : findFactors(number)) {
            product *= factor;
        }
        return product;
    }

    public static long productOfCubeOfFactors(int number) {
        long product = 1;
        for (int factor : findFactors(number)) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int factor : findFactors(number)) {
            if (factor != number) sum += factor;
        }
        return sum == number;
    }

    public static boolean isAbundant(int number) {
        int sum = 0;
        for (int factor : findFactors(number)) {
            if (factor != number) sum += factor;
        }
        return sum > number;
    }

    public static boolean isDeficient(int number) {
        int sum = 0;
        for (int factor : findFactors(number)) {
            if (factor != number) sum += factor;
        }
        return sum < number;
    }

    public static boolean isStrong(int number) {
        int sum = 0, temp = number;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == number;
    }

    private static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = 28; 

        System.out.println("Number: " + number);
        System.out.println("Factors: " + java.util.Arrays.toString(findFactors(number)));
        System.out.println("Greatest Factor: " + findGreatestFactor(number));
        System.out.println("Sum of Factors: " + sumOfFactors(number));
        System.out.println("Product of Factors: " + productOfFactors(number));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(number));
        System.out.println("Is Perfect Number? " + isPerfect(number));
        System.out.println("Is Abundant Number? " + isAbundant(number));
        System.out.println("Is Deficient Number? " + isDeficient(number));
        System.out.println("Is Strong Number? " + isStrong(number));
    }
}
