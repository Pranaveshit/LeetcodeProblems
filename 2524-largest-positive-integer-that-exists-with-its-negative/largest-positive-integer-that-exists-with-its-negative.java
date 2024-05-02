
class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set =  new HashSet<>(); 
        int maxi = -1; 

        for(int i : nums){
            set.add(i);
        }

        for(int i:nums){
            if(i>0 && set.contains(-i)){
                maxi = Math.max(maxi,i);
            }
        }
        return maxi;
    }
}