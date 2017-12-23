import java.util.*;
import java.util.Map.Entry;


class ListNode{
	int val;
	ListNode next;
	ListNode(int x)
	{
		val=x;
		next=null;
	}
	
}

//main class
public class Leetcode
{

	
//main method - driver function----------------------------------------------------------------
public static void main(String[] args)
{
	int[] nums1 = {90,100,200,300};
	int[] nums2 = {95,96,105,301,500};
	int m = nums1.length;
	int n = nums2.length;
	merge(nums1, m, nums2, n); 
	//90,90, 96, 100,105, 200, 300,301, 500
}// main
//------------------------------------------------------------------------Main---------------------
// merge two sorted array

public static void merge(int[] nums1, int m, int[] nums2, int n) 
{ 
	int [] mergedarr = new int[m+n];
	int i=0,j=0,k=0;
	
	while(i<m && j<n)
	{
		mergedarr[k++]=nums1[i]<nums2[j]?nums1[i++]:nums2[j++];
		
	}
	
	while(i<m)
	{
		mergedarr[k++]=nums1[i++];
	}
	
	while(j<n)
	{
		mergedarr[k++]=nums2[j++];
	}
	
    for(int x=0;x<m+n;x++)
	{
       System.out.print(mergedarr[x]+" "); 
    }
	
}	
//--------------------------------------------------------------------------------------------------
//83. Remove Duplicates from Sorted List
//Given 1->1->2->3->3, return 1->2->3

//approach1 - for sorted list
public ListNode deleteDuplicates(ListNode head) 
{
	ListNode cur=head;
	while(cur!=null)
	{
		ListNode temp = cur.next;
		while(temp!=null && cur.val==temp.val)
		{
			temp=temp.next;
		}//while
		cur.next=temp;
		cur=cur.next;
			
	}//while
	return head;
}//method

//approach 2 for both sorted and unsorted list
public static  ListNode deleteDuplicates2(ListNode head) 
{   
	LinkedHashMap<Integer,Integer> lhm=new LinkedHashMap<Integer,Integer>();
	ListNode h1 = new ListNode(0);
	ListNode p = h1;
	ListNode temp = head;
	while(temp!=null)
	{
		if(!lhm.containsKey(temp.val))
		{
			lhm.put(temp.val,1);
		}
		temp=temp.next;
	}
	
	for(Entry<Integer,Integer>entry:lhm.entrySet())
	{
		//System.out.print((int) entry.getKey());
	    p.next=new ListNode((int) entry.getKey());
		p=p.next;
	}
	
	return h1.next;    
}


//------------------------------------------------------------------------------------------------
//70. Climbing Stairs
//input: 3
//output: 3
public static int climbStairs(int n) 
{
	if(n<=0)
	{
		return 0;
	}
	if(n==1)
		return 1;
	if(n==2)
		return 2;
	return climbStairs(n-1)+climbStairs(n-2);
}//method

//--------------------------------------------------------------------------------------------------
//69. Sqrt(x)
//input: 8
//output : 2
public static int mySqrt(int x) 
{
	long start = 0;
	long end = x / 2 + 1;
	while (start <= end) 
	{
		long mid = (start + end) / 2;
		if (mid * mid == x)
			return (int)mid;
		if (mid * mid < x)
			start = mid + 1;
		else
			end = mid - 1;
	}
	return (int)end;
}
//-------------------------------------------------------------------------------------------------
///67. Add Binary
//a = "11"
//b = "1"
//Return "100".
 public static String addBinary(String a, String b) 
 {
	StringBuilder sum = new StringBuilder("");
	
	int carry =0;
	int i = a.length()-1;
	int j = b.length()-1;
	while(i>=0 && j>=0)
	{
		int av = (a.charAt(i)=='0')?0:1;
		int bv = (a.charAt(j)=='0')?0:1;
		int v = av+bv+carry;
		
		sum.append(v%2);
		carry=v/2;
		i--;
		j--;

	}//while
	
	while(i>=0)
	{
		int av = (a.charAt(i)=='0')?0:1;
		int v = av+carry;
		sum.append(v%2);
		carry=v/2;
		i--;
	}
	
	while(j>=0)
	{
		int bv = (a.charAt(j)=='0')?0:1;
		int v = bv+carry;
		sum.append(v%2);
		carry=v/2;
		j--;
	}
	
	if(carry==1)
	{
		sum.append("1");
	}
	return sum.reverse().toString();
        
}//method
//-------------------------------------------------------------------------------------------------
//66. Plus One
public static int[] plusOneMethod(int[] digits) 
{
	for(int i=digits.length-1;i>=0;i--)
	{
		if(digits[i]<9)
		{
			digits[i]++;
			return digits;
		}
		digits[i]=0;
	}//for
	digits = new int[digits.length+1];
	digits[0]=1;
	return digits;
}//method
//-------------------------------------------------------------------------------------------------
//58. Length of Last Word
//Input: "Hello World"
//Output: 5
public static int lengthOfLastWordMethod(String s) 
{
	if(s==null || s.length()==0)
	{
		return 0;
	}
	String[] strArr = s.split("\\s+");
	//String[] strArr = s.split(" ");
	int lastWordlength = 0;
	if(strArr.length==0)
	{
		return 0;
	}
	else
	{
		lastWordlength = strArr[strArr.length-1].length();
	}
	return lastWordlength;
}//method
//-------------------------------------------------------------------------------------------------
//53. Maximum Subarray
//input: [-2,1,-3,4,-1,2,1,-5,4]
//output: [4,-1,2,1] has the largest sum = 6
//kadane's algorith
public static int maxSubArray(int[] nums) 
{
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
	return max_Sofar;
}//method

//-------------------------------------------------------------------------------------------------
//35 Search Insertion Position
//if no duplicates and array is in sorted - O(n)
 public int searchInsert(int[] A, int target) 
 {
	// if the array is empty, just insert target into index 0
	if (A.length == 0) 
		return 0;
	// iterate the array until the end
	for (int i = 0; i < A.length; i++) 
	{
		if (target<=A[i]) 
		{
			return i;
		}	
	}//for
	// insert at the end
	return A.length;
}


//-------------------------------------------------------------------------------------------------
//28 Implement strStr()
//Input: haystack = "hello", needle = "ll"
//Output: 2
public static int strStr(String haystack, String needle) 
{
	if(haystack==null || needle==null)    
		return -1;
 
	if(needle.length() == 0)
		return -1;
 
	for(int i=0; i<haystack.length(); i++)
	{
		if(needle.length() > haystack.length())
			return -1;
 
		int m = i;
		for(int j=0; j<needle.length(); j++)
		{
			if(needle.charAt(j)==haystack.charAt(m))
			{
				if(j==needle.length()-1)
				{
					return i;
				}	    
				m++;
			}
			else
			{
				break;
			}
 
		}//for    
	}//for   
	return -1;
}



//-------------------------------------------------------------------------------------------------
//27 Remove Elements - Given an array and a value, remove all instances of that value in-place and return the new length.
public static int removeElement(int[] nums, int val) {
    int j=0;
	for(int i=0;i<nums.length;i++)
	{
		if(nums[i]!=val)
		{
			nums[j]=nums[i];
			j++;
		}
	}//for
    return j;
}
//------------------------------------------------------------------------------------------------
//26 Remove Duplicate from sorted array - count duplicate elements and substract from Array length
public static int removeDuplicates(int[] input)
{
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
//-------------------------------------------------------------------------------------------------
// 21 Merge Two Sorted Lists
//5->10->15 ,    2->3->20   resulList : 2->3->5->10->15->20
public static ListNode mergeTwoLists(ListNode l1, ListNode l2)
{
	ListNode head = new ListNode(0);
	ListNode p = head;
	while(l1!=null || l2!=null)
	{
		if(l1!=null && l2!=null)
		{
			if(l1.val<l2.val)
			{
				p.next = l1;
				l1=l1.next;
			}
			else 
			{
				p.next = l2;
				l2=l2.next;
				
			}
			p=p.next;	
		}//if
		else if(l1==null)
		{
			p.next = l2;
			break;
		}
		else if(l2==null)
		{
			p.next = l1;
			break;
		}	
	}//while
	return head.next;
}  
//------------------------------------------------------------------------------------------------
//20 Valid Parentheses  
public static boolean isValid(String s) 
{
	HashMap<Character, Character> map = new HashMap<Character, Character>();
	map.put('(', ')');
	map.put('[', ']');
	map.put('{', '}');
 
	Stack<Character> stack = new Stack<Character>();
 
	for (int i = 0; i < s.length(); i++) 
	{
		char curr = s.charAt(i);
 
		// if char belongs to key then push into stack
		if (map.keySet().contains(curr)) 
		{
			stack.push(curr);
		}
		// if char belongs to value then pop from stack but with checking that value belongs to stack peek key element
		else if (map.values().contains(curr)) {
			if (!stack.empty() && map.get(stack.peek()) == curr) 
			{
				stack.pop();
			} else {
				return false;
			}
		}
	}//for
 
	return stack.empty();
}

//-------------------------------------------------------------------------------------------------
//14. Longest Common Prefix
//Input  : {"apple", "ape", "april"}
//Output : "ap"

public static String longestCommonPrefix(String[] input) 
{
    if(input==null || input.length==0) 
		return null;

	int minlen = Integer.MAX_VALUE;

	String shortest = null;

	// O(n) time complexity

	//first find out string with min length in string array
	for(String s : input)
	{

		if(s.length() < minlen) 
		{

			minlen = s.length();
			shortest = s;

		}

	}//for loop

	
	int stop = shortest.length();

	for(int i=0;i<shortest.length();i++)
	{
		char ch = shortest.charAt(i);
		for(String s : input)
		{
			if(s.charAt(i) != ch)
			{
				stop = i;
				break;
			}
		}//for

	}//for

	return shortest.substring(0,stop);
}	

//-------------------------------------------------------------------------------------------------
//13. Roman to Integer
//Input : MCMIV
//Output :  1904
public static int romanToInt(String s) 
{
	if (s == null || s.length() == 0) return 0;
	 
	// create a hash table to store the dictorary
	HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
	hashMap.put('I', 1);
	hashMap.put('V', 5);
	hashMap.put('X', 10);
	hashMap.put('L', 50);
	hashMap.put('C', 100);
	hashMap.put('D', 500);
	hashMap.put('M', 1000);
	 
	int num = 0;
	 
	for (int i = 0; i < s.length(); i++) 
	{
		if (i <= s.length() - 2 && hashMap.get(s.charAt(i)) < hashMap.get(s.charAt(i + 1))) 
		{
			num -= hashMap.get(s.charAt(i));
		} 
		else 
		{
			num += hashMap.get(s.charAt(i));
		}
	}
	return num;
}
//--------------------------------------------------------------------------------------------------
//9 Plaindrome number
public static boolean isPalindrome(int x) 
{
    int rev = 0;
	int original = x;
    while(x != 0)
	{
        rev = rev*10 + x%10;
        x = x/10;
    }
    return rev==original;
}

//----------------------------------------------------------------------------------------------------------------
//7.  Reverse Integer
/*Reverse digits of an integer.
Example1: x = 123, return 321
Example2: x = -123, return -321 */
//approach 1
/*
We can convert the integer to a string/char array, reverse the order, and convert the string/char array back to an integer. However, this will require extra space for the string. 
It doesn't seem to be the right way, if you come with such a solution.

*/

//approach 1
public static int reverse(int x) {
    int rev = 0;
    while(x != 0)
	{
        rev = rev*10 + x%10;
        x = x/10;
    }
    return rev;
}

//approach 2
public static int reverse_int(int x) {
	//flag marks if x is negative
	boolean flag = false;
	if (x < 0) {
		x = 0 - x;
		flag = true;
	}
 
	int res = 0;
	int p = x;
 
	while (p > 0) {
		int mod = p % 10;
		p = p / 10;
		res = res * 10 + mod;
	}
 
	if (flag) {
		res = 0 - res;
	}
 
	return res;
}
//------------------------------------------------------------------------------------------------------
//1 2sum
//1. 2sum problem 
 public static int[] twoSum(int[] nums, int target) 
 {
   
   Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
   int[] ans = new int[2];
   for(int i=0;i<nums.length;i++)
   {
	   if(ht.containsKey(target-nums[i]))
	   {
		   ans[0]=(int)ht.get(target-nums[i]);
		   ans[1]= i;
		   break;
	   }
	   else
	   {
		   ht.put(nums[i],i); // store target-num as key and index i as value
	   }
   }
	return ans;
   
}

//other way using iterative method
public static boolean twoSum2(int[] nums, int target)
{
	boolean isPresent = false;
	int l = 0;
	int r = nums.length-1;
	Arrays.sort(nums);
	while(l<r)
	{
		if(nums[l]+nums[r]==target)
		{
			isPresent = true;
			break;
		}
		else if(nums[l]+nums[r]<target)	
		{
			l++;
		}
		else if(nums[l]+nums[r]>target)	
		{
			r--;
		}
	}//while
	return isPresent;
	
}
//-----------------------------------------------------------------------------------------------------
	
	
	
	
	
}//class---------------------------------------------class End---------------------------------------------------------------------	