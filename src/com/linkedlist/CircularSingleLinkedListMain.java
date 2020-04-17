package com.linkedlist;

public class CircularSingleLinkedListMain
{
	public static void main(String args[])
	{
		CircularSingleLinkedList cirularSigleList = new CircularSingleLinkedList();
		cirularSigleList.createCircularSingleLinkedList(10);
		cirularSigleList.insertInCircularLinkedList(11, 1);
	    cirularSigleList.insertInCircularLinkedList(18, 2);
	    cirularSigleList.insertInCircularLinkedList(46, 1);
	    cirularSigleList.traverseSingleCircularLinkedList();
	}

}
