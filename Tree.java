package DFS;
import java.util.*;

	public class Tree{
			Tree left;
			Tree right;
			int val;
			Tree( int val ){
				this.val = val;
			}
		
		Tree root;
		public Tree() {
			root = null;
		}
		public void reverse( Tree root ){
			if( root == null ){
				return;
			}
			Tree temp = root.right;
			root.right = root.left;
			root.left = temp;
			reverse( root.left);
			reverse( root.right);
		}
		public void print(){
			printTree(root);
		}
		private void printTree( Tree root){
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
		private Tree insertRec( Tree root, int val ){
			if( root == null ){
				Tree node = new Tree(val);
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
			int[] nums = {5,3,7,1,2,6,9,4,8};
			for( int i=0; i<nums.length; i++){
				tree.insert( nums[i]);
			}
			tree.print();
			System.out.println("    ");
			System.out.println("============================");
			tree.reverse(tree.root);
			tree.print();
		}
	}
	

