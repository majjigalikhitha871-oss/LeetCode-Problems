# Sum of Unique Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums`. The unique elements of an array are the elements that appear  **exactly once**  in the array.

Return  *the  **sum**  of all the unique elements of* `nums`.

 

 **Example 1:** 

```
Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.

```

 **Example 2:** 

```
Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.

```

 **Example 3:** 

```
Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.

```

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 1 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 57.62%)  
**Memory:** 42.4 MB (beats 97.66%)  
**Submitted:** 2026-10-27T15:33:41.218Z  

```java
class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:nums)
        {
            if(map.containsKey(ele)==true)
            {
                int prev_count=map.get(ele);
                map.put(ele,prev_count+1);
            }
            else
            {
                map.put(ele,1);
            }
        }
        int sum=0;
        for(int key:map.keySet())
        {
            if(map.get(key)==1)
            {
                sum=sum+key;
            }
        }
        return sum;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sum-of-unique-elements/)