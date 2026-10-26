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