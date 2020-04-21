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
		if (!isDoubleLinkedListExists())
			return;
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
		System.out.println(size);
		DoubleNode current = head; 
		for(int i =0;i<size;i++)
		{
			System.out.print(current.getValue()+" ");
			current = current.getNext();
		}
	}
	
}

