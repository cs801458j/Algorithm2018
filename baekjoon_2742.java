import java.util.Scanner;
public class baekjoon_2742 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int i;
		for(i=x; i>0; i--){
			System.out.println(x--);		
		}
	}
}
