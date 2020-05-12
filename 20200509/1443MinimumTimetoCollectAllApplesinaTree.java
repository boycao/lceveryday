class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        int res = 0;
        Map<Integer,Integer> unvisited = new HashMap<>();
        //Map<Integer,Integer> visited = new HashMap<>();
        for(int[] edge:edges){
            unvisited.put(edge[1],edge[0]);
        }
        unvisited.put(0,-1);
        for(int i=1; i<n; i++){
            if(hasApple.get(i)){
                if(unvisited.get(i)!=-1){
                    int parent = unvisited.get(i);
                    int curr = i;
                    while(unvisited.get(curr)!=-1){
                        res+=2;
                        unvisited.put(curr,-1);
                        //visited.put(curr,parent);
                        curr = parent;
                        parent = unvisited.get(parent);
                        
                    }
                }
                
            }
        }
        return res;
    }
}