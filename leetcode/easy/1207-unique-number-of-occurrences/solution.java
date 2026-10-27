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