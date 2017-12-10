/*
Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.


*/

 class RemoveElement {
    public static int removeElement(int[] nums, int val) {
		int pre = 0;
		int curr= 0;
		while(curr<nums.length)
		{
			if(nums[curr]!=val)
			{
				nums[pre]=nums[curr];
				pre++;
			}
			curr++;
		}//while
        return pre;
    }//method
	
		
		public static void main(String[] args){
		int[] input_arr = {3,2,2,3,3,4};
		int lenArrayWithUninque = removeElement(input_arr,3); 
		System.out.println(lenArrayWithUninque);
		
	}//main
	
	
	
	
}//class