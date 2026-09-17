class Solution {
    public int differenceOfSum(int[] nums) {
        int add = 0;
        for(int i = 0 ; i < nums.length ; i++ ){
            add +=nums[i];
        }
        int z = 0,sum = 0;
        for(int j = 0;j<nums.length;j++){
            z = nums[j];
            while(z!=0){
                sum = sum + (z%10);
                z = z/10;
            }
        }
        return add-sum;
    }
}