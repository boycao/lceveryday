class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] ch1 = s1.toCharArray(), ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int res = ch1[0]-ch2[0];
        for(int i=1; i<ch1.length; i++){
            if(res*(ch1[i]-ch2[i])<0) return false;
            else if(ch1[i]-ch2[i]!=0) res = ch1[i]-ch2[i];
        }
        return true;
    }
}