package com.linkedlist;

import com.node.SingleNode;

public class SingleLinkedList 
{

	SingleNode head ;
	SingleNode tail;
	int size=0;
	//creation of singular linked list
	public void createSingleLinkedList(int value)
	{
	  SingleNode node = new SingleNode();
	  node.setValue(value);
	  node.setNext(null);
	  head = node;
	  tail = node;
	  size++;

	}
	
	public boolean isLinkedListExists()
	{
		if (head==null){
			return false;
				}
		else
		{
			return true;
		}
		
	}
	
	public void insertInLinkedList(int nodeValue,int position) {
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		
		if (!isLinkedListExists())
		{
			System.out.println("Link List doesnt exist");
			return;
		}

		else if (position == 0)
		{
			node.setNext(head);
			head=node;
			size++;
		}
		else if (position >= size)
		{
			node.setNext(null);
			tail.setNext(node);
			tail = node;
			size++;
		}
		else
		{
			SingleNode current = head;
			int pointer = 0;
			while(current != null)
			{
				if (pointer==position-1)
				{
					break;
				}
				    current=current.getNext();
					pointer++;	
				
			}
			node.setNext(current.getNext());
			current.setNext(node);
			size++;
		}
	}
	
	public void traverseLinkedList()
	{
		SingleNode current = head;
		while(current != null)
		{
			System.out.print(current.getValue()+ ", ");
			current = current.getNext();
		}
	}
}
