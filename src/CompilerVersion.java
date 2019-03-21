import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CompilerVersion {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str=br.readLine())!=null){
			for (int i = 0; i < str.length(); i++) {
				char c=str.charAt(i);
				if(c=='/'){
					if(str.charAt(i+1)=='/') {
						System.out.print(str.substring(i, str.length()));
						break;
					}
				}
				if(c!='-')
					System.out.print(c);
				else{
					if(str.charAt(i+1)=='>')
					{
						System.out.print('.');
						i++;
					}
				}
			}
			System.out.println();
		}

	}

}
