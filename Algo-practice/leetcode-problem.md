# Problems


- [1. Two Sum](#1-two-sum)
- [2. Add Two Numbers](#2-add-two-numbers)
- [152. Maximum Product Subarray](#152-maximum-product-subarray)
- [53. Maximum Subarray](#53-maximum-subarray)
- [3. Longest Substring Without Repeating Characters](#3-longest-substring-without-repeating-characters)
- [724. Find Pivot Index](#724-find-pivot-index)
- [242. Valid Anagram](#242-valid-anagram)


## 1. Two Sum
```
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 105
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

Solution : TC- O(n) - Using HashMap 
```
```java
//java code
public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> hm = new HashMap<>();
    int[] res = new int[2];
    for(int i=0;i<nums.length;i++){
      int diff = target-nums[i];
      if(hm.containsKey(diff)){
        res[0]=hm.get(diff);
        res[1]=i;
        break;
      }
      hm.put(nums[i],i);
    }
    return res; 
}
```

```ruby
#ruby code
# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def two_sum(nums, target)
  hash={}
  nums.each_with_index do |a, i|
    diff = target - a
    return [hash[diff], i] if hash[diff]
    hash[a] = i
  end
end
```
---
## 2. Add Two Numbers
```
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
```

```java

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode dummy = new ListNode(0);
      ListNode curr = dummy;
      int carry = 0;
      while(l1!=null || l2!=null){
        int x = l1!=null?l1.val:0;
        int y = l2!=null?l2.val:0;
        int sum = x+y+carry;
        curr.next = new ListNode(sum%10);
        carry = sum/10;
        curr = curr.next;
        if(l1!=null){
          l1=l1.next;
        }
        if(l2!=null){
          l2=l2.next;
        }
      }
      if(carry==1){
        curr.next = new ListNode(1);
      }
      return dummy.next;
 }
```
---

## 152. Maximum Product Subarray
```
Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.

Example 1:

Input: [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
```

```java
public int maxProduct(int[] nums) {
      
      int curr_max=nums[0];
      int curr_min=nums[0];
      int prev_max=nums[0];
      int prev_min=nums[0];
      int res=nums[0];
      for(int i=1;i<nums.length;i++){
        curr_max=Math.max(Math.max(prev_max*nums[i], prev_min*nums[i]), nums[i]);
        curr_min=Math.min(Math.min(prev_max*nums[i], prev_min*nums[i]), nums[i]);
        res=Math.max(curr_max,res);
        prev_max=curr_max;
        prev_min=curr_min;
      }
      return res;   
}
```
```ruby
# @param {Integer[]} nums
# @return {Integer}
def max_product(nums)
  curr_max=nums[0]
  curr_min=nums[0]
  prev_max=nums[0]
  prev_min=nums[0]
  res=nums[0]
  nums[1..-1].each do |a|
    curr_max = [prev_max*a, prev_min*a, a].max
    puts curr_max
    curr_min = [prev_max*a, prev_min*a, a].min
    res = [curr_max, res].max
    prev_max=curr_max
    prev_min=curr_min
  end
  return res
end
```
---
## 53. Maximum Subarray
```
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [0]
Output: 0
Example 4:

Input: nums = [-1]
Output: -1
Example 5:

Input: nums = [-2147483647]
Output: -2147483647
 

Constraints:

1 <= nums.length <= 2 * 104
-231 <= nums[i] <= 231 - 1
```
```java
//Gready Approach
public int maxSubArray(int[] nums) {
 int maxSum = nums[0];
 int currSum = nums[0];
 for(int i=1;i<nums.length;i++){
     currSum =Math.max(nums[i], currSum+nums[i]);
     maxSum =Math.max(maxSum, currSum);
 }
 return maxSum;
}
```
```ruby
# @param {Integer[]} nums
# @return {Integer}
def max_sub_array(nums)
  curr_max = nums[0]
  max = nums[0]
  nums[1..-1].each do |a|
    curr_max = [curr_max+a, a].max
    max = [curr_max, max].max
  end
  return max
end
```
---

## 3. Longest Substring Without Repeating Characters

```
Given a string s, find the length of the longest substring without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Example 4:

Input: s = ""
Output: 0
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
```

```java
//Using HashSet and two pointer
public int lengthOfLongestSubstring(String s) {
  int pointer_a = 0;
  int pointer_b = 0;
  int maxLen = 0;
  int n = s.length();

  HashSet<Character> hs = new HashSet<>();

  while(pointer_b < n) {
    if(!hs.contains(s.charAt(pointer_b))){
      hs.add(s.charAt(pointer_b));
      pointer_b++;
      maxLen = Math.max(hs.size(), maxLen);
      //System.out.println(maxLen);
    }
    else{
      hs.remove(s.charAt(pointer_a));
      pointer_a++;
    }
  }
  return maxLen;  
}
```

```ruby
# @param {String} s
# @return {Integer}
def length_of_longest_substring(s)
  pointer_a = 0
  pointer_b = 0
  max = 0
  set = Set.new
  n = s.length
 
  while pointer_b < n do
    if !set.include?(s[pointer_b]) 
      set.add(s[pointer_b])
      pointer_b = pointer_b+1
      max = [set.size, max].max
    else
      set.delete(s[pointer_a])
      pointer_a = pointer_a+1
    end   
  end
  return max
end
```

## 724. Find Pivot Index

```
Given an array of integers nums, write a method that returns the "pivot" index of this array.

We define the pivot index as the index where the sum of all the numbers to the left of the index is equal to the sum of all the numbers to the right of the index.

If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.

 

Example 1:

Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
Also, 3 is the first index where this occurs.
Example 2:

Input: nums = [1,2,3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.
 

Constraints:

The length of nums will be in the range [0, 10000].
Each element nums[i] will be an integer in the range [-1000, 1000].
```
```java
public int pivotIndex(int[] nums) {
      if(nums==null){
        return -1;
      }
      int nums_sum = 0;
      for(int num:nums){
        nums_sum += num;
      }
      
      int leftSum = 0;
      for(int i=0; i<nums.length; i++){
        if(leftSum == nums_sum - leftSum - nums[i]){
          return i;
        }
        leftSum += nums[i];
      }
      
      return -1;  
    }
```

## 242. Valid Anagram

```
Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
```

```java
public boolean isAnagram(String s, String t) {
      if(s.length()!=t.length()){
          return false;
      }
      HashMap<Character, Integer> hm = new HashMap<>();
      
      for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(hm.containsKey(ch)){
          hm.put(ch, hm.get(ch)+1);
        }
        else{
          hm.put(ch,1);
        }
      }
      
      for(int i=0;i<t.length();i++){
        char ch = t.charAt(i);
        if(hm.containsKey(ch)){
          if(hm.get(ch)==1){
            hm.remove(ch);
          }
          else{
            hm.put(ch, hm.get(ch)-1);
          }
        }
        else{
          return false;
        }
      }
      
      if(hm.size()==0){
        return true;
      }
      return false;
        
    }
```

```java
public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        
        int[] charCount = new int[256];
        for(int i=0;i<s.length();i++){
            charCount[s.charAt(i)]++;
            charCount[t.charAt(i)]--;
        }
        for(int i: charCount){
            if(i!=0){
                return false;
            }
        }
        return true; 
    }
```



