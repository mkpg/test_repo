class Solution {
    public int maximumWealth(int[][] accounts) {
        int s = 0;
        int [] d = new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            for(int j = 0;j<accounts[i].length;j++){
                    s = s + accounts[i][j];
            }
            d[i] = s;
            s=0;
        }
         Arrays.sort(d);
         return d[d.length-1];
    }
}