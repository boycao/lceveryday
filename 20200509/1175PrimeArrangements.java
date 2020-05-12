class Solution {
    public int numPrimeArrangements(int n) {
        int count = 0;
        for(int i=2; i<=n; i++){
            if(isPrime(i)) count++;
        }
        long res = 1;
        for(int i=1; i<=count; i++){
            res = res*i%1_000_000_007;
        }
        for(int i=1; i<=n-count; i++){
            res = res*i%1_000_000_007;
        }
        return (int)res;
    }
    private boolean isPrime(int k){
        for(int i=2; i<=Math.sqrt(k);i++){
            if(k%i == 0 ) return false;
        }
        return true;
    }
}