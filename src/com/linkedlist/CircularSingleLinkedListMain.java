package com.linkedlist;

public class CircularSingleLinkedListMain
{
	public static void main(String args[])
	{
		CircularSingleLinkedList cirularSigleList = new CircularSingleLinkedList();
		cirularSigleList.createCircularSingleLinkedList(10);
		cirularSigleList.insertInCircularLinkedList(11, 1);
	    cirularSigleList.insertInCircularLinkedList(18, 2);
	    cirularSigleList.insertInCircularLinkedList(44, 1);
	    cirularSigleList.insertInCircularLinkedList(45, 1);
	    cirularSigleList.insertInCircularLinkedList(46, 1);
	    cirularSigleList.insertInCircularLinkedList(47, 1);
	    cirularSigleList.insertInCircularLinkedList(48, 1);
	    cirularSigleList.traverseSingleCircularLinkedList();
	    System.out.println("Position of 46 is "+ cirularSigleList.searchInCircularLinkedList(46));
	    
	    // Delete first node
	    cirularSigleList.deleteInCircularLinkedList(0);
	    cirularSigleList.traverseSingleCircularLinkedList();
	    
	    //Delete Last Node
	    cirularSigleList.deleteInCircularLinkedList(20);
	    cirularSigleList.traverseSingleCircularLinkedList();
	    
	    //Delete something in between
	    cirularSigleList.deleteInCircularLinkedList(2);
	    cirularSigleList.traverseSingleCircularLinkedList();
	    
	    cirularSigleList.deleteInCircularLinkedList(1);
	    cirularSigleList.traverseSingleCircularLinkedList();
	    
	    cirularSigleList.deleteInCircularLinkedList(5);
	    cirularSigleList.traverseSingleCircularLinkedList();
	    
	    cirularSigleList.deleteInCircularLinkedList(5);
	    cirularSigleList.traverseSingleCircularLinkedList();
	    cirularSigleList.deleteInCircularLinkedList(5);
	    cirularSigleList.traverseSingleCircularLinkedList();
	    cirularSigleList.deleteInCircularLinkedList(5);
	    cirularSigleList.traverseSingleCircularLinkedList();
	}

}
