class Solution {
    public String capitalizeTitle(String title) {
        String a = title.toLowerCase();
        String[] b = a.split(" ");
        StringBuilder c = new StringBuilder();
        for (int i = 0; i < b.length; i++) {
            if((b[i].length()>2)){
            c.append(Character.toUpperCase(b[i].charAt(0)));
            c.append(b[i].substring(1));}
            else c.append(b[i]);
            if (i != b.length - 1)
                c.append(" ");
            // c.append(b[i]);
            // c.append(Character.toUpperCase(b[i].charAt(0)));
        }
        return c.toString();

    }
}