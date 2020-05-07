class Solution {
    public int findMinFibonacciNumbers(int k) {
        int res = 0, a = 1, b = 1;
        while(b<=k){
            int c = a;
            a = b;
            b = c+b;
        }
        while(a>0 && k>0){
            if(a<=k){
                k -= a;
                res ++;
            }
            int c = a;
            a = b-a;
            b = c;
        }
        return res;
    }
}