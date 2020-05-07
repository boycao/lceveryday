    public boolean kLengthApart(int[] nums, int k) {
        if(nums.length<k) return false;
        int step = 0;
        int index = 0;
        for(; index<nums.length; index++){
            if(nums[index]==1){
                index++;
                break;
            }
                
        }
        for(; index<nums.length;index++){
            if(nums[index]==1){
                if(step<k)
                    return false;
                else
                    step = 0;
            }else{
                step++;
            }
        }
        return true;
    }
}