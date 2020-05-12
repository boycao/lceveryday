class Solution { 
    int res = 0;
    public int maxLength(List<String> arr) {
        for(int i=0; i<arr.size(); i++){
            dfsHelper(arr,i,new HashSet<>());
        }
        return res;
    }
    private void dfsHelper(List<String> arr, int i, Set<Character> set){
        
        for(char c:arr.get(i).toCharArray()){
           // System.out.println("reached"+set.size());
            if(set.contains(c)) return;
            else set.add(c);
        }
        res = Math.max(res,set.size());
       // System.out.println(set.size()+" "+res);
        for(int index = i; index<arr.size();index++){
            dfsHelper(arr,index,new HashSet<>(set));
        }
    }
}