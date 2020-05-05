class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int key:map.keySet()){
            pq.offer(map.get(key));
        }
        int target = arr.length/2, count = 0;
        while(target>0){
            target -= pq.poll();
            count++;
        }
        return count;
    }
}