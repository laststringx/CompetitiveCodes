import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OZandStrings {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	private long[] array;
	private static int length;

	static long total[];

	static long o[];
	static long z[];

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		OZandStrings hello = new OZandStrings();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {

			String numbersInput[] = br.readLine().split(" ");
			int n = Integer.parseInt(numbersInput[0]);
			int numO = Integer.parseInt(numbersInput[1]);
			int numZ = Integer.parseInt(numbersInput[2]);
			String[] strings = br.readLine().split(" ");
			total=new long[n];
			o=new long[n];
			z=new long[n];
			for (int i = 0; i < n; i++) {
				total[i] = strings[i].length();
				for (int j = 0; j < total[i]; j++) {
					if (strings[i].charAt(j) == 'O')
						o[i]++;
					else
						z[i]++;
				}
			}

			hello.sort(total);
			int answer = 0;
			for (int i = 0; i < n; i++) {
				if (numO >= o[i] && numZ >= z[i]) {
					answer++;
					numO -= o[i];
					numZ -= z[i];

				}

			}
			System.out.println(answer);
		}
	}

	private void quickSort(int lowerIndex, int higherIndex) {

		int i = lowerIndex;
		int j = higherIndex;

		long pivot = array[(lowerIndex + (higherIndex - lowerIndex) / 2)];

		while (i <= j) {

			while (array[(int) i] < pivot) {
				i++;
			}
			while (array[(int) j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);

				i++;
				j--;
			}
		}

		if (lowerIndex < j)
			quickSort(lowerIndex, j);
		if (i < higherIndex)
			quickSort(i, higherIndex);
	}

	private void exchangeNumbers(int i, int j) {
		long temp = array[i];
		array[i] = array[j];
		array[j] = temp;

		long temp2 = z[i];
		z[i] = z[j];
		z[j] = temp2;
		long temp3 = o[i];
		o[i] = o[j];
		o[j] = temp2;
	}

	public void sort(long[] ging) {

		if (ging == null || ging.length == 0) {
			return;
		}
		this.array = ging;
		length = ging.length;
		quickSort(0, length - 1);
	}
}
