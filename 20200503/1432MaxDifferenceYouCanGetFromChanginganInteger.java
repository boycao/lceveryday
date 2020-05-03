class Solution {
    public int maxDiff(int num) {
        String numstr = Integer.toString(num);
        char[] maxstr = numstr.toCharArray(),minstr = numstr.toCharArray();
        for(int i=0; i<maxstr.length;i++){
            if(maxstr[i]!='9'){
                helper(maxstr,maxstr[i],'9',i);
                break;
            }
        }
        for(int i=0; i<minstr.length;i++){
            if(i==0 && minstr[i]!='1'){
                helper(minstr,minstr[i],'1',i);
                break;
            }else if(i!=0 && minstr[i]!='0' && minstr[i]!='1'){
                 helper(minstr,minstr[i],'0',i);
                break;
            }
        }
        int res = 0;
        for(int i=maxstr.length-1; i>=0; i--){
            res += (maxstr[i]-minstr[i])*Math.pow(10,maxstr.length-i-1);
        }
        return res;
    }
    public void helper(char[] ch, char c, char t, int index){
        for(int i=index; i<ch.length; i++){
            if(ch[i]==c) ch[i] = t;
        }
    }
}