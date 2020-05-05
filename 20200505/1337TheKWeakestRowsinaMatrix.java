class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> kqueue = new PriorityQueue<>((a,b)-> a[1]==b[1]? a[0]-b[0] : a[1]-b[1]);
        for(int i=0; i<mat.length; i++){
            int count = 0;
            for(int j : mat[i]){
                if(j==1) count++;
            }
            kqueue.offer(new int[]{i,count});
        }
        int[] res = new int[k];
        for(int i=0; i<k; i++){
            res[i] = kqueue.poll()[0];
        }
        return res;
    }
}
// note that the pq order may reverse your ideal output since you are polling them