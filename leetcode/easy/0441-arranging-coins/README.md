# Arranging Coins

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You have `n` coins and you want to build a staircase with these coins. The staircase consists of `k` rows where the `ith` row has exactly `i` coins. The last row of the staircase  **may be**  incomplete.

Given the integer `n`, return  *the number of  **complete rows**  of the staircase you will build*.

 

 **Example 1:** 

```
Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.

```

 **Example 2:** 

```
Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.

```

 

 **Constraints:** 

- 1 <= n <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 9 ms (beats 7.29%)  
**Memory:** 42.4 MB (beats 86.98%)  
**Submitted:** 2026-10-27T15:47:54.431Z  

```java
class Solution {
    public int arrangeCoins(int n) {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            n=n-i;
            c++;
        }
        return c;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/arranging-coins/)