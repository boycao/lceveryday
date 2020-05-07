class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int res = 1;
        for(int i=0 ; i<nums.length-1; i++){
            int max = nums[i], min = nums[i], diff = 0, j=i+1;
            while(j<nums.length){
                max = Math.max(max,nums[j]);
                min = Math.min(min,nums[j]);
                diff = Math.abs(max-min);
                if(diff>limit) break;
                j++;
            }
            res = Math.max(res,j-i);
            if(j==nums.length) break;
            //System.out.println("i="+i+" j="+j+" max="+max+" min="+min+" diff="+diff+" res="+res);
        }
        return res;
    }
}