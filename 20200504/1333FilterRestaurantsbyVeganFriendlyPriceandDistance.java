class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<int[]> rests = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for(int[] r:restaurants){
            if((veganFriendly == 0 || veganFriendly==r[2]) && r[3]<=maxPrice && r[4] <=maxDistance){
                rests.add(r);
            }
        }
        Collections.sort(rests,(a,b)-> a[1]==b[1]?  b[0]-a[0]:b[1]-a[1]);
        
        for(int[] r: rests ){
            res.add(r[0]);
        }
        return res;
    }
}