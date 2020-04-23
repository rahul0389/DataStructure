package com.linkedlist;

import com.node.DoubleNode;

public class DoubleLinkedList 
{
	DoubleNode head = null;
	DoubleNode tail = null;
	int size=0;

	public void createDoubleLinkedList(int value)
	{
		DoubleNode node = new DoubleNode();
		node.setValue(value);
		node.setPrev(null);
		node.setNext(null);
		head=tail=node;
		size++;
	}
	
	public boolean isDoubleLinkedListExists()
	{
		if(head != null)
			return true;
		else 
			return false;
	}
	public void insertInDoubleLinkedList(int value, int position)
	{
		DoubleNode node = new DoubleNode();
		node.setValue(value);
		if (!isDoubleLinkedListExists()) {
			return;}
		else if (position==0)
		{
			head.setPrev(node);;
			node.setNext(head);
			head = node;
			size++;
		}
		else if (position > size)
		{
			node.setNext(null);
			node.setPrev(tail);
			tail.setNext(node);
			tail= node;
			size++;
		}
		
		else 
		{
			DoubleNode current = head;
			for(int i=0;i<position-1;i++)
			{
				current = current.getNext();
			}
			node.setNext(current.getNext());
			current.setNext(node);
			node.setPrev(current);
			size++;
		}
	}
	
	public void traverseDoubleLinkedList()
	{
	
		DoubleNode current = head; 
		for(int i =0;i<size;i++)
		{
			System.out.print(current.getValue()+" ");
			current = current.getNext();
		}
		System.out.println();
	}
	
	//Delete Node from Double Linked List
	
	public void deleteNodeInCircularLinkedList(int pos)
	{
		if (!isDoubleLinkedListExists())
		{ System.out.println("List Empty. Cannot Delete Item");
			return;}
		if(pos==0)
		{
			if (size==1)
			{
				head=tail=null;
				size=0;
				return;
			}
			head=head.getNext();
			head.setPrev(tail);
			tail.setNext(head);
		}
		else if (pos>=size)
		{
			tail=tail.getPrev();
			head.setPrev(tail);
		}
		
		else {
			DoubleNode current = head;
			for(int i =0;i<pos-1;i++)
			{
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
			current.getNext().getNext().setPrev(current);
			
		}
		size--;
	}
	
	
	//Search Node in circular linked list
	
	
}

