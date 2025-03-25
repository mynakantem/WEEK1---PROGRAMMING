import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        int[][] studentScores = generateRandomScores(numStudents); // Generate random scores
        double[][] computedData = computeResults(studentScores); // Compute total, average, percentage

        displayScorecard(studentScores, computedData); // Display results
        scanner.close();
    }

    public static int[][] generateRandomScores(int num) {
        Random random = new Random();
        int[][] scores = new int[num][3];

        for (int i = 0; i < num; i++) {
            scores[i][0] = 50 + random.nextInt(51); 
            scores[i][1] = 50 + random.nextInt(51); 
            scores[i][2] = 50 + random.nextInt(51);
        }

        return scores;
    }

    public static double[][] computeResults(int[][] scores) {
        int num = scores.length;
        double[][] results = new double[num][3];

        for (int i = 0; i < num; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; 
            results[i][2] = Math.round(percentage * 100.0) / 100.0; 
        }

        return results;
    }

    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("\nStudent Scorecard:");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("ID\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("--------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            int physics = scores[i][0];
            int chemistry = scores[i][1];
            int math = scores[i][2];
            int total = (int) results[i][0];
            double average = results[i][1];
            double percentage = results[i][2];
            String grade = getGrade(percentage);

            System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t%.2f%%\t\t%s\n",
                    (i + 1), physics, chemistry, math, total, average, percentage, grade);
        }
        
        System.out.println("--------------------------------------------------------------------------------------");
    }
}
