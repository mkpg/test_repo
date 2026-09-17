class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum = 0, add = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){sum = sum + nums[i];}
            else add = add + nums[i];
        }
        if(add>sum || add<sum)return true;
       else return false;
    }
}