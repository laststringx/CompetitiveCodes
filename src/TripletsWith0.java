import java.util.Arrays;
import java.util.Scanner;

public class TripletsWith0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println(bin_search(A, 0, n - 1, k));

	}

	public static boolean findTriplets(int arr[], int n) {
		int l, r;
		Arrays.sort(arr);
		for (int i = 0; i < n - 1; i++) {
			l = i + 1;
			r = n - 1;
			int curr = arr[i];
			while (l < r) {
				if (curr + arr[l] + arr[r] == 0) {
					return true;
				} else if (curr + arr[l] + arr[r] > 0) {
					r--;
				} else {
					l++;
				}
			}
		}
		return false;

	}

	static int bin_search(int A[], int left, int right, int k) {
		// Your code here
		int mid = (left + right) / 2;
		if (left > right)
			return -1;
		if (A[mid] == k) {
			return mid;
		} else if (A[mid] > k) {
			return bin_search(A, left, mid - 1, k);
		} else
			return bin_search(A, mid + 1, right, k);
	}
}
