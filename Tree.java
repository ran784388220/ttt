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
		public void topView(){
			if( root == null ){
				return;
			}
			Map<Integer, Tree> map = new HashMap<>();
			topView( root, map, 0);
			for( Tree node: map.values() ){
				System.out.print( node.val+"  ");
			}
		}
		private void topView( Tree root, Map<Integer, Tree> map, int level ){
			if( root == null ){
				return;
			}
			if( !map.containsKey(level) ){
				map.put(level, root);}
			topView( root.left, map, level-1);
			topView( root.right, map,level+1);
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
			tree.topView();
			System.out.println("    ");
			System.out.println("============================");
//			================================================
			tree = new Tree();
			nums = new int[]{5};
			for( int i=0; i<nums.length; i++){
				tree.insert( nums[i]);
			}
			tree.print();
			System.out.println("    ");
			System.out.println("============================");
			tree.topView();
			System.out.println("    ");
			System.out.println("============================");
//			================================================
			tree = new Tree();
			nums = new int[]{1,2,3};
			for( int i=0; i<nums.length; i++){
				tree.insert( nums[i]);
			}
			tree.print();
			System.out.println("    ");
			System.out.println("============================");
			tree.topView();
			System.out.println("    ");
			System.out.println("============================");
//			================================================
			tree = new Tree();
			tree.print();
			System.out.println("    ");
			System.out.println("============================");
			tree.topView();
			System.out.println("    ");
			System.out.println("============================");
//			================================================
			tree = new Tree();
			nums = new int[]{3,2,1};
			for( int i=0; i<nums.length; i++){
				tree.insert( nums[i]);
			}
			tree.print();
			System.out.println("    ");
			System.out.println("============================");
			tree.topView();
			System.out.println("    ");
			System.out.println("============================");
		}
	}
	

