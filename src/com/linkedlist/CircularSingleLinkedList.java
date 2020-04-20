package com.linkedlist;

import com.node.SingleNode;

public class CircularSingleLinkedList 
{
	private SingleNode head;
	private SingleNode tail;
	private int size=0;
	public SingleNode getHead() {
		return head;
	}
	public void setHead(SingleNode head) {
		this.head = head;
	}
	public SingleNode getTail() {
		return tail;
	}
	public void setTail(SingleNode tail) {
		this.tail = tail;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	 // Creation of Circular Linked List
	public void createCircularSingleLinkedList(int value)
	{
		SingleNode node = new SingleNode();
		node.setValue(value);
		node.setNext(null);
		head = node;
		tail = head;
		size++;
	}
	
	
	// Linked List Exist
	public boolean isCircularLinkedListExists()
	{
		if(head == null)
		{
			return false;
		}
		else
			return true;
	}
	
	
	//Get size of the linkedlist
	public int getCircularLinkedListSize()
	{
		return size;
	}
	
	// Insert a node in Circular Linked List
	public void insertInCircularLinkedList(int value, int position)
	{
		SingleNode node = new SingleNode();
		node.setValue(value);
		SingleNode current = head;
		if(!isCircularLinkedListExists())
		{
			System.out.println("Circular Linked List doesnt exist");
			return;
		}
		else if (position == 0)
		{
			node.setNext(head);
			tail.setNext(node);
			head = node;
			size++;
		}
		else if (position >= size)
		{
			tail.setNext(node);
			node.setNext(head);
			tail = node;
			size++;
		}
		else 
		{
			for(int i =0;i<position-1;i++)
			{
				current = current.getNext();
			}
			node.setNext(current.getNext());
			current.setNext(node);
			size++;
		}
	}
	
	// Traverse Linked List
	public void traverseSingleCircularLinkedList()
	{
		System.out.println("Linked List Traverse");
		SingleNode current = head;
		for(int i=0; i<getCircularLinkedListSize();i++ )
		{
			System.out.print(current.getValue()+" ");
			current = current.getNext();
		}
		System.out.println();
	}
	
	// Search in Linked List and return position
	
	public int searchInCircularLinkedList(int searchValue)
	{
		SingleNode current = head;
		for(int i=0; i<getCircularLinkedListSize();i++ )
		{
			if (current.getValue()==searchValue)
				return i;
			current = current.getNext();
		}
		return -1;
	}
	
	// Delete in Circular Linked List
	
	public void deleteInCircularLinkedList(int position)
	{
		if(!isCircularLinkedListExists())
		 return;
		
		else
		{
			if(position==0)
			{
				head=head.getNext();
				tail.setNext(head);
			}
			else if (position>=size-1)
			{
				SingleNode current=head;
				
				for(int i =0;i<size-2;i++)
				{
					current=current.getNext();
				}
				if(current==tail)
				{
					System.out.println("Setting head and tail to null");
					head=tail=null;
					return;
				}
				tail=current;
				current.setNext(head);
			}
			
			else
			{   SingleNode current=head;
				for(int i =0;i<position-1;i++)
				{
					current=current.getNext();
				}
				current.setNext(current.getNext().getNext());
			}
			size--;
		}
	}
}
