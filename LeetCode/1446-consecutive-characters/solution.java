class Solution {
    public int maxPower(String s) {
        int c = 1;
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<s.length()-1;i++){
            
                if(s.charAt(i)==s.charAt(i+1)){
                    c++;
                    a.add(c);
                    }
                else c = 1;
            
        }
       int max = 1;
if (!a.isEmpty()) {
    max = a.get(0);
    for (int b : a) {
        if (b > max) max = b;
    }
}
return max;

    }
}