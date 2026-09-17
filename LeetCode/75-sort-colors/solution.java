class Solution {
    public void sortColors(int[] nums) {
        int arr[] = new int[nums.length];
        int j = 0;
        for(int i = 0 ; i <nums.length;i++){
            if(nums[i]==0){
                arr[j] = nums[i];
                j++;
        }}


        for(int i = 0 ; i <nums.length;i++){
            if(nums[i]==1){
                arr[j] = nums[i];
                j++;
        }}

        
        for(int i = 0 ; i <nums.length;i++){
            if(nums[i]==2){
                arr[j] = nums[i];
                j++;
        }}

          for(int i = 0 ; i <nums.length;i++){
            nums[i]=arr[i];
            }
    }
}