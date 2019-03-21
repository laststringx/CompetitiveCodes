import java.util.Scanner;

public class FindPair {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		long count=0;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if((arr[j]==arr[i])){
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
