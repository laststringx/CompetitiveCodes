import java.util.Scanner;

public class SirJadeja {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long k=sc.nextLong();
			long temp=k;
			long i=1;
			while(temp>0){
				temp-=i*7;
				i++;
				temp--;
			}
			i--;
			temp++;
			System.out.println("i"+i);
			temp+=i*7;
			System.out.println(temp);
			temp/=(i);
			
			System.out.println(temp);
			String arr[] = { "Rohit", "Dhawan", "Kohli", "Yuvraj", "Raina",
					"Dhoni", "Sir Jadeja" };
			System.out.println(arr[(int) temp-1]);
			
			
			

		}

	}
}
