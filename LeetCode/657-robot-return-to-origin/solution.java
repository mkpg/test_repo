class Solution {
    public boolean judgeCircle(String a) {
      
        char[] b = a.toCharArray();
        int c = 0,j =0 ;
        for(int i =0;i<b.length;i++){
            if(b[i]=='U') c++;
            else if(b[i]=='D') c--;
            else if(b[i]==('R')) j++;
            else j--;
        }
        if(c==0 && j==0)return true;
        return false;
    }
}