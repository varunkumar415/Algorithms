/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
*/


class FindMedianSortedArras_LC4 {
    
    //Varun Kumar
    //Time: O(n+m) Space: O(m+n)
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] nums = new int[len1+len2];
        int i=0;
        int j= 0;
        int k = 0;
        double res = 0;
         while(i<len1 && j<len2){
             if(nums1[i]<nums2[j]){
                 nums[k++]=nums1[i++];
             }
             else{
                 nums[k++]=nums2[j++];
             }
         }
        
        while(i<len1){
            nums[k++] = nums1[i++];
        }
        
        while(j<len2){
            nums[k++] = nums2[j++];
        }

        int mid = (nums.length)/2;
        
        if((nums.length)%2==0){
            res = (nums[mid]+nums[mid-1])/2.0;    
        }
        else{
            res = nums[mid];
            System.out.println(res);
        }
        return res;
        
    }
}
