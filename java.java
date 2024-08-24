public class HalfDiamondStarNumberPattern {

    public static void main(String[] args) {
        int rows = 10; // Adjust the number of rows as needed

        // Print the ascending half-diamond
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // Print the number
            }
            System.out.println(); // Move to the next line
        }

        // Print the descending half-diamond (excluding the first row)
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}