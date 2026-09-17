// class Solution {
//     public int majorityElement(int[] nums) {
//         int c = 0;
//         int[] ar = new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             for(int j = 0;j<nums.length;j++){
//                 if(nums[i]==nums[j])c++;
//             }ar[i] = c;
//             c=0;
//         }
//         int d =0;
//         for(int i=0;i<ar.length;i++){
//             if(ar[i]>(nums.length/2))
//                 d =  nums[i];}
//             return d;
            
//     }
// } 
//  the above didnt work as i got time limit exceeded issue so this
class Solution {
    public int majorityElement(int[] nums) {
         Arrays.sort(nums);
    return nums[nums.length/2];
            
    }
}