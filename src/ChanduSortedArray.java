import java.util.Arrays;
import java.util.Scanner;


public class ChanduSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			long arr[]=new long[n];
			for (int i = 0; i < n; i++) {
				arr[i]=sc.nextLong();
			}
			Arrays.sort(arr);
			for (int i = n-1; i >=0; i--) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
		}
		

	}

}
