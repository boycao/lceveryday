class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List <Integer> res = new ArrayList();
    
        for (int digit=2;digit<=9;digit++){
            for (int base=1;base<=10-digit;base++){
                int currVal = 0;
                for (int j=0;j<digit;j++){
                    currVal = currVal * 10 + (base + j);
                }
                if (currVal >= low && currVal <= high){
                    res.add(currVal);
                }
            }
        }
        return res;
        
    }
}