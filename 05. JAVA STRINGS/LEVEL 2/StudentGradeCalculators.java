import java.util.Random;

public class StudentGradeCalculators {
    
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects: PCM

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 40 + rand.nextInt(61); 
            scores[i][1] = 40 + rand.nextInt(61); 
            scores[i][2] = 40 + rand.nextInt(61); 
        }
        return scores;
    }

    public static double[][] computeResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; 

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;  
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static String[] computeGrades(double[][] results) {
        int numStudents = results.length;
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            double percentage = results[i][2];

            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("\nStudent Scorecard:");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.printf("%-10s | %-8s | %-8s | %-8s | %-8s | %-8s | %-10s | %-6s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Avg", "Percentage", "Grade");
        System.out.println("-------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10s | %-8d | %-8d | %-8d | %-8.0f | %-8.2f | %-10.2f | %-6s\n",
                    "Student " + (i + 1), scores[i][0], scores[i][1], scores[i][2], 
                    results[i][0], results[i][1], results[i][2], grades[i]);
        }
        System.out.println("-------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int numStudents = 5; 
        int[][] scores = generateScores(numStudents);
        double[][] results = computeResults(scores);
        String[] grades = computeGrades(results);

        displayScorecard(scores, results, grades);
    }
}
