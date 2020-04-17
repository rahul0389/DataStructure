package com.linkedlist;

public class SingleLinkedListMain {
	public static void main(String args[])
	{
		SingleLinkedList list = new SingleLinkedList();
		list.createSingleLinkedList(0);
		list.insertInLinkedList(1, 1);
		list.insertInLinkedList(2, 2);
		list.insertInLinkedList(33, 1);
		list.insertInLinkedList(37, 1);
		list.traverseLinkedList();
		System.out.println("\nPosition of 37 is " + list.searchInLinkedList(37));
		System.out.println("Position of 47 is " + list.searchInLinkedList(47));
	}

}
