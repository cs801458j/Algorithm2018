import java.util.Scanner;
import java.util.Arrays;
public class backjoon_07_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String data = input.next();
		int alpha[] = new int[26];
		Arrays.fill(alpha, -1);
//		int dataArray[] = new int[data.length()];
//		Arrays.fill(dataArray, -1);
		for(int i=0; i<data.length();i++){
			// 중복된 문자 처리 
			if(alpha[data.charAt(i) - 97] == -1)
				alpha[data.charAt(i) - 97]= i;			 				 
		}		
		for(int i=0; i<alpha.length; i++){
			System.out.print(alpha[i]+" ");
		}
		//System.out.println(Arrays.toString(alpha));
	}
}
