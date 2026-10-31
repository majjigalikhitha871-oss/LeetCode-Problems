# Maximum Average Subarray I

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums` consisting of `n` elements, and an integer `k`.

Find a contiguous subarray whose  **length is equal to**  `k` that has the maximum average value and return  *this value*. Any answer with a calculation error less than `10-5` will be accepted.

 

 **Example 1:** 

```
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

```

 **Example 2:** 

```
Input: nums = [5], k = 1
Output: 5.00000

```

 

 **Constraints:** 

- n == nums.length
- 1 <= k <= n <= 105
- -104 <= nums[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 77.64%)  
**Memory:** 69.2 MB (beats 86.15%)  
**Submitted:** 2026-10-31T14:04:50.638Z  

```java
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int window_sum=0;
        for(int i=0;i<k;i++)
        {
            window_sum=window_sum+nums[i];
        }
        int max=window_sum;
        for(int i=k;i<nums.length;i++)
        {
            window_sum=window_sum+nums[i]-nums[i-k];
            max=Math.max(window_sum,max);
        }
        return (double)max/k;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-average-subarray-i/)