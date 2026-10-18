package Lecture_36;

public class BinarySearchTree {
	class Node {
		int val;
		Node left;
		Node right;
		
		Node(int val) {
			this.val = val;
		}
	}
	
	private Node root;
	
	public BinarySearchTree(int [] in) {
		root = CreateTree(in, 0, in.length);
	}

	private Node CreateTree(int[] in, int i, int length) {
		return null;
	}

}
