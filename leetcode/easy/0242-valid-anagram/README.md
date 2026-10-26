# Valid Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

 

 **Example 1:** 

 **Input:**  s = "anagram", t = "nagaram"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "rat", t = "car"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.

 

 **Follow up:**  What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 85.03%)  
**Memory:** 43.8 MB (beats 95.78%)  
**Submitted:** 2026-10-26T16:01:29.529Z  

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int index=ch-97;
            arr[index]++;
        }
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            int index=ch-97;
            arr[index]--;
        }
        for(int ele:arr)
        {
            if(ele!=0)
            {
                return false;
            }
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)