/*
1)
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/

import java.util.*;

public class TwoSum{
	
	 public static int[] twoSum(int[] nums, int target) {
       
	   Hashtable ht = new Hashtable();
	   int[] ans = new int[2];
	   for(int i=0;i<nums.length;i++)
	   {
		   if(ht.containsKey(nums[i]))
		   {
			   ans[0]=(int)ht.get(nums[i]);
			   ans[1]= i;
			   break;
		   }
		   else
		   {
			   ht.put(target-nums[i],i); // store target-num as key and index i as value
		   }
	   }
		return ans;
	   
    }
	
	public static void main(String[] args){
		
		System.out.println("Two Sum Problem");
		//Scanner sc = new Scanner(System.in);
		int[] nums = {2, 11, 12, 7};
		int target = 9;
		int[] ans=new int[2];
		ans=twoSum(nums,target);
		//System.out.println(ans); // wrong it wont print in correct way
		System.out.println(ans[0]+" "+ans[1]);
		
	}
}