# Maximum Number of Vowels in a Substring of Given Length

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s` and an integer `k`, return  *the maximum number of vowel letters in any substring of* `s` *with length* `k`.

 **Vowel letters**  in English are `'a'`, `'e'`, `'i'`, `'o'`, and `'u'`.

 

 **Example 1:** 

```
Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.

```

 **Example 2:** 

```
Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.

```

 **Example 3:** 

```
Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of lowercase English letters.
- 1 <= k <= s.length

## Solution

**Language:** Java  
**Runtime:** 11 ms (beats 92.46%)  
**Memory:** 45.7 MB (beats 97.67%)  
**Submitted:** 2026-10-31T14:19:25.331Z  

```java
class Solution {
    public int maxVowels(String s,int k)
    {
        int window_sum=0;
        for(int i=0;i<k;i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u')
            {
                window_sum++;
            }
        }
        int max=window_sum;
        for(int i=k;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u')
            {
                window_sum++;
            }
            ch=s.charAt(i-k);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u')
            {
                window_sum--;
            }
            max=Math.max(max,window_sum);
        }
        return max;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/)