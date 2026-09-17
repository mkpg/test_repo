// import java.util.HashSet;
// // import java.util.Set;
// import java.util.Collections;

class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> a = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            a.add(nums[i]);
        }
         if (a.size() < 3) {
            return Collections.max(a);
        }

        a.remove(Collections.max(a));
        a.remove(Collections.max(a));
        return Collections.max(a);
        
    }
}