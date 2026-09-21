class Solution {
    int sum = 0 ;
    public int countDigits(int num) {
        sum = num;
        int temp =0;
        int c = 0;
        while(sum!=0){
            temp = sum%10;
            if(num%temp==0) c++;
            sum /=10;
        }
        return c;
    }
}