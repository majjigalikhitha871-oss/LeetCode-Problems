# Reverse Vowels of a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, reverse only all the vowels in the string and return it.

The vowels are `'a'`, `'e'`, `'i'`, `'o'`, and `'u'`, and they can appear in both lower and upper cases, more than once.

 

 **Example 1:** 

 **Input:**  s = "IceCreAm"

 **Output:**  "AceCreIm"

 **Explanation:** 

The vowels in `s` are `['I', 'e', 'e', 'A']`. On reversing the vowels, s becomes `"AceCreIm"`.

 **Example 2:** 

 **Input:**  s = "leetcode"

 **Output:**  "leotcede"

 

 **Constraints:** 

- 1 <= s.length <= 3 * 105
- s consist of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 98.88%)  
**Memory:** 46.3 MB (beats 76.57%)  
**Submitted:** 2026-10-29T11:59:29.976Z  

```java
class Solution {
    public boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String reverseVowels(String s) {
        char[] st=s.toCharArray();
        int left=0,right=st.length-1;
        while(left<right)
        {
            while(left<right&&isVowel(st[left])==false)
            {
                left++;
            }
            while(left<right&&isVowel(st[right])==false){
                right--;
            }
            if(left<right)
            {
                char temp=st[left];
                st[left]=st[right];
                st[right]=temp;
                left++;
                right--;
            }
        }
        return String.valueOf(st);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-vowels-of-a-string/)