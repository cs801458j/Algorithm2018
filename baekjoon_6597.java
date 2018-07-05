import java.util.Scanner;
public class baekjoon_6597 {
	
	public static void treeRecover(int preleft, int preright, int inleft, int inright, char[] preord, char[] inord){
		int root, leftsize, rightsize;		
		if(preleft > preright && inleft > inright){
			return;
		}				
		//	1. 중위 순회에서 루트 찾기 (중위 순회 배열 길이만큼 돈다) 		
		for(root = inleft; root<= inright; root++){
			if(preord[preleft] == inord[root]) break;
		}		
		//	2. 서브트리 사이즈 계산 
		leftsize = root - inleft;
		rightsize = inright - root;
		
		// 3. 서브트리 복원
		if(leftsize > 0) treeRecover(preleft+1, preleft + leftsize, inleft, root -1, preord, inord);
		if(rightsize > 0) treeRecover(preleft+leftsize+1, preright, root+1, inright, preord, inord);
		
		// 4. 루트 프린트 
		System.out.print(inord[root]);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] tree;
	
		while(s.hasNextLine()){
			char[] preord;
			char[] inord;
			String line = s.nextLine();
			if(line.length()>0){
				tree = line.split(" ");
				preord = tree[0].toCharArray();
				inord = tree[1].toCharArray();
				int n = tree[0].length();
				treeRecover(0, n-1, 0, n-1, preord, inord);
				//	요거 빼먹지 말자! 
				System.out.println("");
			}else break;		
		}
			
	}

}
