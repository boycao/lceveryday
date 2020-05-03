class Solution {
    public int kthSmallest(int[][] mat, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
        pq.offer(0);
        for(int[] row:mat){
            PriorityQueue<Integer> next = new PriorityQueue<>((a,b)->b-a);
            for(int i:pq){
                for(int j:row){
                    next.offer(i+j);
                }
            }
            while(next.size()>k) next.poll();
            pq = next;
        }
        return pq.poll();
    }
}
//greedy(since it is sorted) + priority queue 