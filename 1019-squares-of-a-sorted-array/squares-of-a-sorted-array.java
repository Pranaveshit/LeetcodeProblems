import java.util.*;

class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> set = new ArrayList<Integer>(); 
        for(int i : nums){
            set.add(i * i);
        }
        Collections.sort(set);
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = set.get(i);
        }
        return result;
    }
}
