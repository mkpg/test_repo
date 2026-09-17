class Solution {
    public String firstPalindrome(String[] w) {
        for(int i=0;i<w.length;i++){
            StringBuilder a = new StringBuilder(w[i]);
            if((a.reverse()).toString().equals(w[i]))return w[i];
      
        }return "";
    }
}