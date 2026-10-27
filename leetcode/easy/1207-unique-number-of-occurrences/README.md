# Unique Number of Occurrences

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of integers `arr`, return `true`  *if the number of occurrences of each value in the array is  **unique**  or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
```

 **Example 2:** 

```
Input: arr = [1,2]
Output: false

```

 **Example 3:** 

```
Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true

```

 

 **Constraints:** 

- 1 <= arr.length <= 1000
- -1000 <= arr[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 39.60%)  
**Memory:** 43.1 MB (beats 91.29%)  
**Submitted:** 2026-10-27T09:49:56.809Z  

```java
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int ele:arr)
       {
        if(map.containsKey(ele)==true){
            int prev_count=map.get(ele);
            map.put(ele,prev_count+1);
        }
        else
        {
            map.put(ele,1);
        }
       } 
       HashSet<Integer> seen=new HashSet<>();
       for(int key:map.keySet())
       {
        int val=map.get(key);
        if(seen.contains(val)==true)
        {
            return false;
        }
        seen.add(val);
       }
       return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/unique-number-of-occurrences/)