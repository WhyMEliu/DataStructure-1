package com.wuare.test;

import com.wuare.link.LinkedNode;

public class LinkedNodeTest {
	public static void main(String[] args) {
		LinkedNode<String> link = new LinkedNode<String>();
		link.addFirst("1");
		link.addFirst("2");
		link.addFirst("3");
		
		link.addLast("4");
		link.addLast("5");
		link.addLast("6");
		link.print();
		System.out.println("size: " + link.size());
	}
}
