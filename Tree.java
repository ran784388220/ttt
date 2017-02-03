package DFS;
import java.util.*;

	public class Tree{
		class TreeNode{
			TreeNode left;
			TreeNode right;
			int val;
			TreeNode( int val ){
				this.val = val;
			}
		}
		TreeNode root;
		public Tree() {
			root = null;
		}
		public void rev(){
			reverse(root);
		}
		public void reverse( TreeNode root ){
			if( root == null ){
				return;
			}
			TreeNode temp = root.left;
			root.left = root.right;
			root.right = temp;
			reverse( root.left);
			reverse( root.right);
		}
		public void print(){
			printTree(root);
		}
		private void printTree( TreeNode root){
			if( root == null ){
				return;
			}
			System.out.print( root.val +"  ");
			printTree( root.left );
			printTree( root.right );
		}
		public void insert( int val ){
			root = insertRec(root, val);
		}
		private TreeNode insertRec( TreeNode root, int val ){
			if( root == null ){
				TreeNode node = new TreeNode(val);
				return node;
			}
			if( root.val < val ){
				root.right = insertRec( root.right, val);
			}else{
				root.left = insertRec( root.left, val );
			}
			return root;
		}
		public static void main( String[] args ){
			Tree tree = new Tree();
			int[] nums = {1,2,3};
			for( int i=0; i<nums.length; i++){
				tree.insert( nums[i]);
			}
			tree.print();
			System.out.println("    ");
			System.out.println("============================");
			tree.rev();			
			tree.print();
		}
	}
	
//	public static void main( String[] args ){
//		reverseMirror rm = new reverseMirror();
//		TreeNode root = rm.new TreeNode(1);
//		root.left = rm.new TreeNode(2);
//		root.right = rm.new TreeNode(3);
//		root.right.left = rm.new TreeNode(4);
//		root.right.right = rm.new TreeNode(5);
//		rm.printTree(root);
//		rm.reverseHelper(root);
//		System.out.println("==================================");
//		rm.printTree(root);
//	}

