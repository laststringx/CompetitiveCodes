import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class FiboDynamicProgramming {
	// static long arr[] = new long[100];
	// static int SIZE = 10000000;
	static int SIZE = 100000;

	static BigInteger[] bigArray = new BigInteger[SIZE];

	public static void main(String[] args) throws InterruptedException {
		long l = Long.MAX_VALUE;
		System.out.println(l);
		// TODO Auto-generated method stub
		System.out.println("Starting Application...");
		Scanner sc = new Scanner(System.in);
		// Arrays.fill(arr, -1);

		for (int i = 0; i < bigArray.length; i++) {
			bigArray[i] = BigInteger.valueOf(-1);
		}
		bigArray[0] = BigInteger.ZERO;
		bigArray[1] = BigInteger.ONE;

		for (int i = 0; i < SIZE - 1; i++) {
			System.out.println(getFibo(i + 1));

		}

		/*
		 * while (true) { System.out.println("------------------------------");
		 * System.out.println("Enter the number"); int n = sc.nextInt(); if (n == -1)
		 * break; long start = System.currentTimeMillis();
		 * System.out.println(getFibo(n)); long end = System.currentTimeMillis();
		 * System.err.println("Total Time ::" + (end - start));
		 * System.out.println("------------------------------");
		 * 
		 * }
		 */
		System.out.println("Shutting down...");
		System.exit(0);
		sc.close();
	}

	private static BigInteger getFibo(int n) {
		// check if it got in table
		if (!bigArray[n].equals(BigInteger.valueOf(-1))) {
			return bigArray[n];
		} else {

			bigArray[n] = getFibo(n - 1).add(getFibo(n - 2));
			return bigArray[n];
		}

	}

}
