class Solution {
    public boolean isPalindrome(int x) {
        int org=x;
        int reverse=0;
       while(x>0)
       {
        int r=x%10;
        reverse=reverse*10+r;
        x=x/10;
       } 
       if(org==reverse)
       {
        return true;
       }
       else
       {
        return false;
       }
    }
}