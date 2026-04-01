import java.util.Scanner;

public class Java25 {

    public static String convert(String s, int numRows) {

        // Edge case
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];

        // Initialize rows
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Traverse string
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            // Change direction at top or bottom
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1 : -1;
        }

        // Combine rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        System.out.print("Enter Number of Rows: ");
        int numRows = sc.nextInt();

        String output = convert(s, numRows);
        System.out.println("ZigZag Conversion Output: " + output);

        sc.close();
    }
}
