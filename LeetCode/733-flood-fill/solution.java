class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int a = image[sr][sc];
        if(a==color) return image;
        dfs(image,sr,sc,a,color);
        return image;
        }
        public static void dfs(int[][] image, int r ,int c,int a,int color){
            if(r<0 || r>= image.length || c<0 || c >=image[0].length) return;
            if(image[r][c]!=a) return;
            image[r][c]=color;
            dfs(image,r-1,c,a,color);
            dfs(image,r+1,c,a,color);
            dfs(image,r,c-1,a,color);
            dfs(image,r,c+1,a,color);
        }
         
         
    }
