package com.wuare.tree;

public class BinarySearchTree {
	private Node root;
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	
	
	public BinarySearchTree createBinTree(int[] es) {
		if (es == null || es.length == 0) {
			throw new NullPointerException();
		}
		this.root = new Node(null, es[0]);
		for (int i = 1; i < es.length; i++) {
			Node n = this.root;
			Node pn = null;
			boolean isLeft = true;
			while (n != null) {
				pn = n;
				if (es[i] < n.data) {
					n = n.left;
					isLeft = true;
				} else {
					n = n.right;
					isLeft = false;
				}
			}
			if (isLeft) {
				pn.left = new Node(pn, es[i]);
				//System.out.println("insert left: new Node(" + es[i] + "), parent node: " + pn.data);
			} else {
				pn.right = new Node(pn, es[i]);
				//System.out.println("insert right: new Node(" + es[i] + "), parent node: " + pn.data);
			}
			
		}
		return this;
	}
	
	public void find(Node root) {
		if (root != null) {
			//System.out.println(root.data);
			find(root.left);
			find(root.right);
		}
	}
	
	public void find() {
		find(this.root);
	}
	
	public Node min() {
		Node n = this.root;
		while (n.left != null) {
			n = n.left;
		}
		//System.out.println("min data: " + n.data);
		return n;
	}
	
	public Node max() {
		Node n = this.root;
		while (n.right != null) {
			n = n.right;
		}
		//System.out.println("max data: " + n.data);
		return n;
	}

	public static class Node {
		Node parent;
		Node left;
		Node right;
		public Integer data;
		
		public Node(Node parent, Integer integer) {
			this.parent = parent;
			this.data = integer;
		}
		
		public Node() {}
	}
}
