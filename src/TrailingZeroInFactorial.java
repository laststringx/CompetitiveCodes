import java.util.Scanner;


public class TrailingZeroInFactorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		System.out.println(getAnswer(n));
		

	}

private static int getAnswer(int n) {
		
		    int count = 0;
		    for (int i=5; n/i>=1; i *= 5)
		          count += n/i;
		 
		    return count;
		
		 
	}

}
