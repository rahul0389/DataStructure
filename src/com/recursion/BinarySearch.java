package com.recursion;

public class BinarySearch 
{
	public int binarySearch(int arr[], int value, int start, int end)
	{
		if ( start == end)
		{
			if (arr[start]==value)
			{
				return start;
			}
			else return -1; 
		}
		int mid = findMid(arr, start, end);
		
		if (value>arr[mid])
		{
			return(binarySearch(arr, value, mid+1, end));
		}
		else if (value<arr[mid])
		{
			return(binarySearch(arr,value,start,mid-1));
		}
		else 
		{
			return mid;
		}
	}
	
   public int findMid(int arr[], int start, int end)
   {
	   int mid = (start+end)/2;
	   return (mid);
   }
}
