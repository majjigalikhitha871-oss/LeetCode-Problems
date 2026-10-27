# Reverse Only Letters

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, reverse the string according to the following rules:

- All the characters that are not English letters remain in the same position.
- All the English letters (lowercase or uppercase) should be reversed.

Return `s` *after reversing it*.

 

 **Example 1:** 

```
Input: s = "ab-cd"
Output: "dc-ba"

```

 **Example 2:** 

```
Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"

```

 **Example 3:** 

```
Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"

```

 

 **Constraints:** 

- 1 <= s.length <= 100
- s consists of characters with ASCII values in the range [33, 122].
- s does not contain '\"' or '\\'.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.3 MB (beats 96.81%)  
**Submitted:** 2026-10-27T02:22:21.415Z  

```java
class Solution {
    public boolean isalpha(char ch)
    {
        if(ch>='a' && ch<='z'||ch>='A' && ch<='Z')
    {
        return true;
    }
    return false;
    }
    public String reverseOnlyLetters(String s) {
        int left=0,right=s.length()-1;
        char[] res=s.toCharArray();
        while(left<right)
        {
            while(left<right&&isalpha(res[left])==false){
                left++;
        
            }
            while(left<right && isalpha(res[right])==false)
            {
                right--;
            }
            if(left<right)
            {
                char temp=res[left];
                res[left]=res[right];
                res[right]=temp;
                left++;
                right--;
            }
        }
        return new String(res);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-only-letters/)