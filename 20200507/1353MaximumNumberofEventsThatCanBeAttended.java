class Solution {
    public int maxEvents(int[][] events) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.sort(events,(a,b)->Integer.compare(a[0],b[0]));
        int i=0, res = 0, curr = 0;
        while(!pq.isEmpty() || i<events.length){
            if(pq.isEmpty()){
                curr = events[i][0];
            }
            while(i<events.length && events[i][0]<=curr){
                pq.offer(events[i++][1]);
            }
            pq.poll();
            res++;
            curr++;
            while(!pq.isEmpty() && pq.peek()<curr) pq.poll();
        }
        return res;
    }
}