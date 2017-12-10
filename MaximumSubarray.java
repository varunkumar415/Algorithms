/*
Maximum Subarray
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.

Algo: Kadane's Algorithm
*/


class MaximumSubarray {
    public int maxSubArray(int[] nums) {
		int max_Sofar = nums[0], max_endinghere = 0;
		int start=0,end=0,s=0;
		int[] maxSubarr = new int[nums.length];
		
		for(int i=0;i<nums.length;i++)
		{
			max_endinghere = max_endinghere + nums[i];
			if(max_Sofar<max_endinghere)
			{
				max_Sofar = max_endinghere;
				start=s;
				end=i;
			}
			if(max_endinghere<0)
			{
				max_endinghere=0;
				s=i+1;
			}
			
		}//for
		for(int j=start;j<=end;j++)
		{
			maxSubarr[j]=nums[j];
			System.out.print(maxSubarr[j]+" ");
		}
		
		return max_Sofar;
        
    }//method
	
	public static void main(String[] args){
		MaximumSubarray obj = new MaximumSubarray();
		//int[] input_arr = {-2,1,-3,4,-1,2,1,-5,4};
		int[] input_arr = {-1,-1,-2,-4,-1,-2,-1,-5,-4};
		int maxsum = obj.maxSubArray(input_arr); 
		System.out.println("\nsum of maxsubarray: "+maxsum);
		
	}//main
	
}//class