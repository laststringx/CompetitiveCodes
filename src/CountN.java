import java.util.Scanner;


public class CountN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long n=sc.nextLong();
			
			int countTotalNumbers=0;
			for (int i = 1; i <=n; i++) {
				if(ifEven(i)) countTotalNumbers++;
			}
			System.out.println(countTotalNumbers);
		}
		
	}

	private static boolean ifEven(int i) {
		// TODO Auto-generated method stub
		int count=0;
		String str=Integer.toBinaryString(i);
		for (int j = 0; j < str.length(); j++) {
			if(str.charAt(j)=='1')
				count++;
		}
		
		return count%2==0?true:false;
	}

}
