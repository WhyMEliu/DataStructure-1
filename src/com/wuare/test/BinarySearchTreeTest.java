package com.wuare.test;

import com.wuare.tree.BinarySearchTree;
import com.wuare.tree.BinarySearchTree.Node;

public class BinarySearchTreeTest {
	public static void main(String[] args) {
		int[] a = {6, 3, 8, 1, 0, 9, 6, 2};
		BinarySearchTree e0 = new BinarySearchTree().createBinTree(a);
		Node min = e0.min();
		//the min data is 0
		System.out.println("min data: " + min.data);
		Node max = e0.max();
		//the max data is 9
		System.out.println("max data: " + max.data);
	}
}
