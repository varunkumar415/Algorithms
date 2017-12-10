/*
Remove Duplicates from Sorted Array

Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.

algo:
1. find total duplicate elements ie countduplicate
2. return input array length - countduplicate

*/

public class RemoveDuplicatefromSortedArray{
	
	
	public static void main(String[] args){
		int[] input_arr = {1,2,2,3,3,4,4,4,5,6};
		int lenArrayWithUninque = countUniqueElement(input_arr); 
		System.out.println(lenArrayWithUninque);
		
	}//main
	
	public static int countUniqueElement(int[] input){
		int count=0;
		//count duplicate elements in sorted array
		for(int i=0;i<input.length-1;i++)
		{
			if(input[i]==input[i+1])
			{
				count++;
			}
		}//for
		return input.length-count;
		
	}//method
	
}//class