class Solution {
    int res = 0;
    public int maxSideLength(int[][] mat, int threshold) {
        int m = mat.length, n = mat[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]>=threshold) continue;
                //System.out.println("i"+i+"j"+j);
                dfsSum(mat,threshold,i,j, m, n,1, mat[i][j]);
            }
        }
        return res;
    }
    public void dfsSum(int[][] mat, int threshold,int x, int y,int m, int n, int step, int sum){
        if(x+step>=m || y+step>=n) return;
        for(int i=0; i<=step; i++){
            //System.out.print("x"+x+"y"+y);
            //System.out.print( mat[x+step][y+i]+" "+mat[x+i][y+step]+" ");
            sum += mat[x+step][y+i]+mat[x+i][y+step];
        }
        sum -= mat[x+step][y+step];
        //System.out.println("sum"+sum);
        if(sum<=threshold){
            res = Math.max(res,step+1);
            dfsSum(mat,threshold,x,y, m, n, step+1, sum);
        }
        return;
    }
}