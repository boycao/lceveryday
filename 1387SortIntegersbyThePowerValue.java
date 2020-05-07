class Solution {
    public int getKth(int lo, int hi, int k) {
        int[] range = IntStream.rangeClosed(lo, hi).toArray();
        List<int[]> list = new ArrayList<>();
        for(int r:range){
            list.add(new int[]{r,powerHelp(r)});
        }
        Collections.sort(list, (a,b)-> a[1]==b[1]? a[0]-b[0] : a[1]-b[1]);
        return list.get(k-1)[0];
    }
    private int powerHelp(int num){
        int cnt = 0;
        while(num!=1){
            if(num%2==0){
                num/=2;
            }else{
                num=num*3+1;
            }
            cnt++;
        }
        return cnt;
    }
}