class Solution {
    public String largestGoodInteger(String num) {
        int max = -1;
        char[] arr = num.toCharArray();

        for(int i=0;i<arr.length-1;i++){
            int count = 1;
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]) {
                    count++;
                    
                }
                else {
                    break;
                }

            }
            if(count>=3){
                int ele = (int)arr[i]-48;
                
                if(ele>max) max = ele;

            }

        }
        if(max > -1){
            String res = "";
            for(int i= 1;i<4;i++){
                res+=max;
            }
            return res;
        }
        
        return "";
    }
}
