import java.util.Scanner;

public class FindTheArray {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			int b[] = new int[n];
			for (int i = 0; i < n; i++) {
				b[i] = sc.nextInt();
			}
			if(m==0) {
				b[n-1]++;
			}
			boolean flag = true;
			while (m-- > 0 && flag) {
				int A = sc.nextInt()-1;
				String ch = sc.next();
				int B = sc.nextInt()-1;
				if(ch.equals("<")) {
					//if(b[A])
				}
				

			}
		}
		sc.close();
	}

}
