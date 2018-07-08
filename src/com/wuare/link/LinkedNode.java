package com.wuare.link;

public class LinkedNode<E> {
	
	private Node<E> first;
	
	private Node<E> last;
	
	private int size;
	
	public LinkedNode() {
		
	}
	
	public int size() {
		return size;
	}
	
	public void addLast(E e) {
		final Node<E> l = last;
		final Node<E> newNode = new Node<E>(e);
		last = newNode;
		if (l == null) {
			first = newNode;
		} else {
			l.next = newNode;
		}
		size++;
	}
	
	public void addFirst(E e) {
		final Node<E> f = first;
		final Node<E> newNode = new Node<E>(e);
		first = newNode;
		if (f == null) {
			last = newNode;
		} else {
			newNode.next = f;
		}
		size++;
	}
	
	public void add(int index, E e) {
		if (index < 0 || index > index) {
			throw new IndexOutOfBoundsException();
		}
		if (index == size) {
			addLast(e);
		} else {
			//TODO
		}
	}
	
	public void print() {
		Node<E> node = first;
		System.out.print("the LinkedNode datas: [");
		while (node != null) {
			System.out.print(node.data);
			if (node.next != null) {
				System.out.print(", ");
			}
			node = node.next;
		}
		System.out.print("]\n");
	}
	
	
	public static class Node<E> {
		Node<E> next;
		E data;
		public Node(E e) {
			this.data = e;
		}
		public Node() {}
	}
}
