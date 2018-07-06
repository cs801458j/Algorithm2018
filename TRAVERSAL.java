import java.util.Scanner;
class Tree{
	class Node{
		int data;
		Node left, right;	
		Node(int data){
			this.data = data;
		}
	}
	
	Node root;
	static int pIndex = 0;
	
	public void buildTreeByInPre(int in[], int pre[]){
		pIndex = 0;		
		root = buildTreeByInPre(in, pre, 0, in.length-1);
	}
	private Node buildTreeByInPre(int in[], int pre[], int start, int end){
		if (start > end) return null;
		//	전위 순회에서 맨 처음 값이 트리의 루트니까, 이런식으로 시작
		Node node = new Node(pre[pIndex++]);
		
		if (start == end) return node;
		int mid = search(in, start, end, node.data);
		// 루트를 중심으로 왼, 오 재귀로 빌드
		node.left = buildTreeByInPre(in, pre, start, mid -1);
		node.right = buildTreeByInPre(in, pre, mid + 1, end);
		return node;
	}
	
	//	중간 값 찾기
	private int search(int arr[], int start, int end, int value){
		int i;
		for(i=start; i<=end; i++){
			if(arr[i] == value) return i;
		}
		return i;		
	}
	
	void printPostorder(Node node){
		if(node == null) return;
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(node.data+" ");

	}
}
public class TRAVERSAL {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int testcaseCount = input.nextInt();
		
		for(int i=0; i< testcaseCount; i++){
			Tree tree = new Tree();
			int nodeCount = input.nextInt();
			int[] pre = new int[nodeCount];
			int[] in = new int[nodeCount];
			
			//	전위 순회 입력
			for(int j=0; j<nodeCount; j++){
				pre[j] = input.nextInt();
			}
			// 중위 순회 입력 
			for(int j=0; j<nodeCount; j++){
				in[j] = input.nextInt();
			}
		
			tree.buildTreeByInPre(in, pre);
			tree.printPostorder(tree.root);
			System.out.println(" ");
		}
	}

}
