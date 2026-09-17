class Solution {
    public boolean wordPattern(String pattern, String s) {

        char[] ch = pattern.toCharArray();
        String[] st = s.split(" ");

        if(pattern.length()!=st.length) return false;

         HashMap<Character, String> pt = new HashMap<>();
        HashMap<String, Character> ss = new HashMap<>();

        for(int i=0;i<st.length;i++){
            char a1 = ch[i];
            String a2 = st[i];
            if(pt.containsKey(a1)){
                if(!pt.get(a1).equals(a2)) return false;
            }else{
                if(ss.containsKey(a2)) return false;
                pt.put(a1,a2);
                ss.put(a2,a1);
            }
        }return true;
    }
}