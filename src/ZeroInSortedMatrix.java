
public class ZeroInSortedMatrix {

	int countZeros(int A[][], int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (A[i][j] == 0)
					count++;
				else
					break;
			}
			if (A[i][0] == 1)
				break;
		}
		return count;
		// Your code here
	}
}
