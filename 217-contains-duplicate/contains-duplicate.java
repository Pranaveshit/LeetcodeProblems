import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int c = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(); 
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(HashMap.Entry<Integer,Integer> j : map.entrySet()){
            if(j.getValue()>1){
                c+=1;
            }
        }
        return c>0;
        
    }
}