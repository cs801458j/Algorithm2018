import java.util.Scanner;
public class baekjoon_07_01 {

	public static void main(String[] args) {
		// 아스키 코드 출력은 int로 캐스팅하고 코드값 format으로 출력 		
		Scanner input = new Scanner(System.in);
		int data = input.next().charAt(0);
		System.out.println(data);
	}
}
