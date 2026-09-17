class Solution {
    public boolean checkDivisibility(int n) {
        int dup = n;
        int a = 0 , m = 1;
        while(dup!=0){
            a = a + (dup%10);
            m = m * (dup%10);
            dup = dup/10;
        }
        
        int t = a+m;
        if(n%t==0)return true;
        return false;
    }
}