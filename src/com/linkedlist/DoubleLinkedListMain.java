package com.linkedlist;

public class DoubleLinkedListMain 
{
	public static void main(String args[])
	{
	DoubleLinkedList doublelist = new DoubleLinkedList();
	doublelist.createDoubleLinkedList(5);
	doublelist.insertInDoubleLinkedList(1, 0);
	doublelist.insertInDoubleLinkedList(3, 8);
	doublelist.insertInDoubleLinkedList(4, 8);
	doublelist.traverseDoubleLinkedList();
	doublelist.deleteNodeInCircularLinkedList(0);
	doublelist.traverseDoubleLinkedList();
	doublelist.deleteNodeInCircularLinkedList(0);
	doublelist.traverseDoubleLinkedList();
	doublelist.deleteNodeInCircularLinkedList(0);
	doublelist.traverseDoubleLinkedList();
	doublelist.deleteNodeInCircularLinkedList(0);
	doublelist.traverseDoubleLinkedList();
	doublelist.deleteNodeInCircularLinkedList(0);
	doublelist.traverseDoubleLinkedList();
	doublelist.deleteNodeInCircularLinkedList(0);
	doublelist.traverseDoubleLinkedList();
	}
}
