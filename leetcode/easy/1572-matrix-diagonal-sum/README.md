# Matrix Diagonal Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a square matrix `mat`, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

 

 **Example 1:** 

```
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.

```

 **Example 2:** 

```
Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8

```

 **Example 3:** 

```
Input: mat = [[5]]
Output: 5

```

 

 **Constraints:** 

- n == mat.length == mat[i].length
- 1 <= n <= 100
- 1 <= mat[i][j] <= 100

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 30.94%)  
**Memory:** 45.8 MB (beats 91.51%)  
**Submitted:** 2026-10-29T10:22:49.433Z  

```java
class Solution {
    public int diagonalSum(int[][] mat) {
     int n=mat.length;
     int sum=0;
     for(int r=0;r<n;r++)
     {
        for(int c=0;c<n;c++)
        {
            if(r==c||r+c==n-1)
            {
                sum=sum+mat[r][c];
            }
        }
     }  
     return sum;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/matrix-diagonal-sum/)