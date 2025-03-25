import java.util.Arrays;

public class FootballTeamHeightStats {

    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];

        for (int i = 0; i < size; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;  // Generates height between 150 and 250
        }

        return heights;
    }

    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double calculateMeanHeight(int[] heights) {
        return (double) calculateSum(heights) / heights.length;
    }

    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            shortest = Math.min(shortest, height);
        }
        return shortest;
    }

    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            tallest = Math.max(tallest, height);
        }
        return tallest;
    }

    public static void main(String[] args) {
        int size = 11;  
        int[] heights = generateRandomHeights(size);

        System.out.println("Football Team Heights (in cm): " + Arrays.toString(heights));

        double meanHeight = calculateMeanHeight(heights);
        int shortestHeight = findShortestHeight(heights);
        int tallestHeight = findTallestHeight(heights);

        System.out.println("Mean Height: " + meanHeight + " cm");
        System.out.println("Shortest Player Height: " + shortestHeight + " cm");
        System.out.println("Tallest Player Height: " + tallestHeight + " cm");
    }
}
