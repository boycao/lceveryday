class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0] == b[0] ? b[1]-a[1]: a[0]-b[0]);
        List<int[]> list = new ArrayList<>();
        for(int[] i:intervals){
            boolean isCovered = false;
            for(int[] j:list){
                if(j[0]<=i[0] && j[1]>=i[1]){
                    isCovered = true;
                    break;
                }
            }
            if(!isCovered) list.add(i);
        }
        
        return list.size();
    }
}