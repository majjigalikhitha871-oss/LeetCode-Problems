# To Lower Case

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, return  *the string after replacing every uppercase letter with the same lowercase letter*.

 

 **Example 1:** 

```
Input: s = "Hello"
Output: "hello"

```

 **Example 2:** 

```
Input: s = "here"
Output: "here"

```

 **Example 3:** 

```
Input: s = "LOVELY"
Output: "lovely"

```

 

 **Constraints:** 

- 1 <= s.length <= 100
- s consists of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 11.22%)  
**Memory:** 43.3 MB (beats 11.09%)  
**Submitted:** 2026-10-26T15:48:43.749Z  

```java
class Solution {
    public String toLowerCase(String s) {
        String res="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z')
            {
                res=res+(char)(ch+32);
            }
            else
            {
                res=res+ch;
            }
        }
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/to-lower-case/)