import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class InfiniteLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Long> set = new HashSet<Long>();
		long arr[] = new long[n];
		ArrayList<Long> list = new ArrayList<Long>();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		for (int i = 0; i < arr.length; i++) {
			if (!set.contains(arr[i])) {
				list.add(arr[i]);
			}
			set.add(arr[i]);
		}
		System.out.println(set.size());
		for (Long long1 : list) {
			System.out.print(long1 + " ");
		}
		sc.close();
	}

}
