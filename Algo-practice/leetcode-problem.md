# Problems

1. Two Sum
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
2. Add Two Numbers
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
