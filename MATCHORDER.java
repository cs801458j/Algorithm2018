import java.util.Scanner;
import java.util.Arrays;
public class MATCHORDER {

	public static void swap(int x, int y, int arr[]){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
		
	}
	
	public static void sort(int arr[]){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				if(arr[i] < arr[j])
					swap(i, j, arr);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testcaseCount = input.nextInt();
		
		for(int i=0; i< testcaseCount; i++){			
			int playerCount = input.nextInt();
			int[] russia = new int[playerCount];
			int[] korea = new int[playerCount];
			//	러시아 선수 입력
			for(int j=0; j<playerCount; j++){
				russia[j] = input.nextInt();
			}
			// 한국 선수 입력
			for(int j=0; j<playerCount; j++){
				korea[j] = input.nextInt();
			}
			
			sort(russia);
			sort(korea);
//			for(int j=0; j< playerCount; j++){
//				System.out.print(russia[j]+" ");
//			}
//			
//			for(int j=0; j< playerCount; j++){
//				System.out.print(korea[j]+" ");
//			}
			
			// 제일 작은거  & 제일 큰거?
			int min=0, max=0, count =0;
			for(int j=0; j< playerCount; j++){
				min = Integer.MAX_VALUE;
				int index =0;
				for(int k=0; k<playerCount; k++){
					//	러시아 선수가 더 크면 비교할 필요 없으니 break
					if(korea[j]<russia[k])
						break;
					if(russia[k] == -1)
						continue;
					if(korea[j]-russia[k] < min){
						index = k;
						min = korea[j]-russia[k];
					}
						
				}
				if(min != Integer.MAX_VALUE){
					count++;
					russia[index] = -1;					
				}
				
			}
			
			System.out.println(count);
		}
		
	}

}
