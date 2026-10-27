# Check if the Sentence Is Pangram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A  **pangram**  is a sentence where every letter of the English alphabet appears at least once.

Given a string `sentence` containing only lowercase English letters, return `true` *if* `sentence` *is a  **pangram**, or* `false` *otherwise.* 

 

 **Example 1:** 

```
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

```

 **Example 2:** 

```
Input: sentence = "leetcode"
Output: false

```

 

 **Constraints:** 

- 1 <= sentence.length <= 1000
- sentence consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 61.22%)  
**Memory:** 42.6 MB (beats 87.09%)  
**Submitted:** 2026-10-27T02:31:50.260Z  

```java
class Solution {
    public boolean checkIfPangram(String s) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int index=ch-97;
            arr[index]=1;
        }
        for(int ele:arr)
        {
            if(ele==0)
            {
                return false;
            }
        }
        return true;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)