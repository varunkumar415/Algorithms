/*
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0

Algo:
1. Binary search
2. not found then return new start position  

*/

class SearchInsertPosition {
    public int searchInsertposition(int[] nums, int target) {
		int start=0,end=nums.length-1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(nums[mid]==target)
			{
				return mid;
			}
			else if(nums[mid]<target)
			{
				start = mid+1;
			}
			else
				end = mid-1;
		}//while
		return start;
        
    }//method
	
	public static void main(String[] args){
		SearchInsertPosition obj = new SearchInsertPosition();
		int[] input_arr = {1,3,5,6};
		int pos = obj.searchInsertposition(input_arr,7); 
		System.out.println(pos);
		
	}//main
}