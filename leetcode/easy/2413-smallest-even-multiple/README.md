# Smallest Even Multiple

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a  **positive**  integer `n`, return  *the smallest positive integer that is a multiple of  **both*** `2` *and* `n`.

 

 **Example 1:** 

```
Input: n = 5
Output: 10
Explanation: The smallest multiple of both 5 and 2 is 10.

```

 **Example 2:** 

```
Input: n = 6
Output: 6
Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself.

```

 

 **Constraints:** 

- 1 <= n <= 150

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.6 MB (beats 94.01%)  
**Submitted:** 2026-10-27T15:53:44.118Z  

```java
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0)
        {
            return n;
        }
        else
        {
            return n*2;
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-even-multiple/)