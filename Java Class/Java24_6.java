import java.util.Scanner;

public class Java24_6 {

    public static int numMagicSquaresInside(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for (int i = 0; i <= m - 3; i++) {
            for (int j = 0; j <= n - 3; j++) {
                if (isMagic(grid, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isMagic(int[][] g, int r, int c) {

        // Center must be 5
        if (g[r + 1][c + 1] != 5)
            return false;

        boolean[] seen = new boolean[10];

        // Check numbers 1–9 and uniqueness
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                int val = g[i][j];
                if (val < 1 || val > 9 || seen[val])
                    return false;
                seen[val] = true;
            }
        }

        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (g[r + i][c] + g[r + i][c + 1] + g[r + i][c + 2] != 15)
                return false;

            if (g[r][c + i] + g[r + 1][c + i] + g[r + 2][c + i] != 15)
                return false;
        }

        // Check diagonals
        if (g[r][c] + g[r + 1][c + 1] + g[r + 2][c + 2] != 15)
            return false;

        if (g[r][c + 2] + g[r + 1][c + 1] + g[r + 2][c] != 15)
            return false;

        return true;
    }

    // 🔹 MAIN METHOD (USER INPUT)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] grid = new int[rows][cols];

        System.out.println("Enter grid elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int result = numMagicSquaresInside(grid);
        System.out.println("Number of magic squares: " + result);

        sc.close();
    }
}
