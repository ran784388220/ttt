package DFS;
import java.util.*;

public class reverseMirror {
	class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		TreeNode( int val ){
			this.val = val;
		}
	}
	public void reverseNodes( TreeNode root ){
		if( root == null ){
			return;
		}
		reverseHelper( root );
	}
	private TreeNode reverseHelper( TreeNode root ){
		if( root == null ){
			return root;
		}
		if( root.left == null && root.right == null ){
			return root;
		}
		TreeNode temp = reverseHelper( root.left );
		root.left = root.right;
		root.right = temp;
		return root;
	}
	public void printTree( TreeNode root ){
		if( root == null ){
			return;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while( !queue.isEmpty() ){
			int size = queue.size();
			for( int i=0; i<size; i++ ){
				TreeNode cur = queue.poll();
				System.out.print( cur.val+" " );
				if( cur.left != null ){
					queue.offer( cur.left );
				}
				if( cur.right != null ){
					queue.offer( cur.right );
				}				
			}
			System.out.println("   ");
		}
	}
	public static void main( String[] args ){
		reverseMirror rm = new reverseMirror();
		TreeNode root = rm.new TreeNode(1);
		root.left = rm.new TreeNode(2);
		root.right = rm.new TreeNode(3);
		root.left.left = rm.new TreeNode(4);
		root.left.right = rm.new TreeNode(5);
		rm.printTree(root);
		rm.reverseHelper(root);
		System.out.println("==================================");
		rm.printTree(root);
	}
}
