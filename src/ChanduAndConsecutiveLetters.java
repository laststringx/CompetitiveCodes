import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChanduAndConsecutiveLetters {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			
			String str=br.readLine();
			String answer=""+str.charAt(0);
			int j=0;
			for (int i = 1; i < str.length(); i++) {
				char c=str.charAt(i);
				if(answer.charAt(j)!=c){
					answer+=c;
					j++;
				}
			}
			System.out.println(answer);
		}

	}

}
