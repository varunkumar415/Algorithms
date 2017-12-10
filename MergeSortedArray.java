/*
88. Merge Sorted Array
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.



*/

class MergeSortedArray{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastnum1 = m-1;
		 int lastnum2 = n-1;
		 for(int i=m+n-1;i>=0;i--)
		 {
			if(lastnum1<0) 
			{
				nums1[i]=nums2[lastnum2--];
			}
			else if(lastnum2<0)
			{
				nums1[i]=nums1[lastnum1--];
			}
			else
			{
				nums1[i]=nums1[lastnum1] >= nums2[lastnum2] ? nums1[lastnum1--] : nums2[lastnum2--];
			}
		 }//for
		for(int i=0;i<m+n;i++)		
		System.out.print(nums1[i]);	
    }//method
	
	public static void main(String[] args){
		MergeSortedArray obj = new MergeSortedArray();
		int[] input1 = {1,3,5,8};
		int[] input2 = {2,4,6};
		obj.merge(input1,input1.length,input2, input2.length);
		//for(int i=0;i<output.length;i++)		
		//System.out.println(output);	
	}//main
	
}//class