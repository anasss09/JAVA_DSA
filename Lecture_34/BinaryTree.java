package Lecture_34;

import java.util.*;

public class BinaryTree {
	// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
 
	private class Node {
		int val;
		Node left;
		Node right;

		Node(int val) {
			this.val = val;
		}
	}

	private Node root;
	private Scanner sc = new Scanner(System.in);

	// Constructor
	public BinaryTree() {
		root = CreateTree();
	}

	private Node CreateTree() {
		int val = sc.nextInt();
		Node nn = new Node(val);

		boolean hlc = sc.nextBoolean();

		if (hlc) {
			nn.left = CreateTree();
		}

		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = CreateTree();
		}

		return nn;
	}

	public void Display() {
		Display(root);
	}

	private void Display(Node nn) {

		if (nn == null) {
			return;
		}

		String s = "<--" + nn.val + "-->";

		if (nn.left != null) {
			s = nn.left.val + s;
		} else {
			s = "." + s;
		}

		if (nn.right != null) {
			s = s + nn.right.val;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);
	}

	// Maximum in Tree
	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}

		int left = max(nn.left);
		int right = max(nn.right);

		return Math.max(nn.val, Math.max(left, right));
	}

	// Minimum in Tree
	public int min() {
		return min(root);
	}

	private int min(Node nn) {
		if (nn == null) {
			return Integer.MAX_VALUE;
		}

		int left = min(nn.left);
		int right = min(nn.right);

		return Math.min(nn.val, Math.min(left, right));
	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node nn, int item) {
		if (nn == null) {
			return false;
		}

		if (nn.val == item) {
			return true;
		}

		boolean left = find(nn.left, item);
		boolean right = find(nn.right, item);
		return left || right;
	}

	public int height() {
		return height(root);
	}

	private int height(Node nn) {
		if (nn == null) {
			return -1;
		}

		int left = height(nn.left);
		int right = height(nn.right);
		return Math.max(left, right) + 1;
	}

	public void preOrder() {
		preOrder(root);
		System.out.println();
	}

	private void preOrder(Node nn) {
		if (nn == null) {
			return;
		}

		System.out.print(nn.val + " ");
		preOrder(nn.left);
		preOrder(nn.right);
	}

	public void inOrder() {
		inOrder(root);
		System.out.println();
	}

	private void inOrder(Node nn) {

		if (nn == null) {
			return;
		}

		inOrder(nn.left);
		System.out.print(nn.val + " ");
		inOrder(nn.right);
	}

	public void postOrder() {
		postOrder(root);
		System.out.println();
	}

	private void postOrder(Node nn) {

		if (nn == null) {
			return;
		}

		postOrder(nn.left);
		postOrder(nn.right);
		System.out.print(nn.val + " ");
	}

//	public void LevelOrder() {
//		Queue<Node> q = new LinkedList<>();
//		q.add(root);
//
//		while (!q.isEmpty()) {
//			Node r = q.poll();
//			System.out.print(r.val + " ");
//
//			if (r.left != null) {
//				q.add(r.left);
//			}
//
//			if (r.right != null) {
//				q.add(r.right);
//			}
//		}
//		System.out.println();
//	}

	public void LevelOrder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			Node r = q.poll();
			System.out.print(r.val + " ");
			
			if(r.left != null) {
				q.add(r.left);
			}
			
			if(r.right != null) {
				q.add(r.right);
			}
		}
		System.out.println();
	}

}
