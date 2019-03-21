import java.util.Scanner;

public class Sudoku {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int[][] arr = new int[9][9];
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			int length = arr.length;

			solve(arr, length);
			print(arr, length);

		}
		sc.close();

	}

	public static boolean isSafe(int arr[][], int row, int col, int num) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length; i++) {
			if (arr[row][i] == num) {
				return false;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][col] == num)
				return false;
		}
		int sq = (int) Math.sqrt(arr.length);
		int boxRow = row - row % sq;
		int boxCol = col - col % sq;
		for (int i = boxRow; i < boxRow + sq; i++) {
			for (int j = boxCol; j < boxCol + sq; j++) {
				if (arr[i][j] == num)
					return false;
			}
		}
		return true;
	}

	public static boolean solve(int[][] arr, int n) {
		int row = -1;
		int col = -1;

		boolean isEmpty = true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				count++;
				if (arr[i][j] == 0) {
					row = i;
					col = j;
					isEmpty = false;
					break;

				}

			}
			if (!isEmpty)
				break;
		}
		if (isEmpty)
			return true;

		for (int i = 1; i <= n; i++) {
			if (isSafe(arr, row, col, i)) {
				arr[row][col] = i;
				if (solve(arr, n)) {
					return true;
				} else
					arr[row][col] = 0;

			}
		}
		return false;

	}

	public static void print(int[][] board, int N) {
		for (int r = 0; r < N; r++) {
			for (int d = 0; d < N; d++) {
				System.out.print(board[r][d] + " ");
			}
		}
		System.out.println();
		System.out.println(count);
	}
}
