class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String pre=strs[0];
        int prelen=pre.length();
        for(int i=1;i<strs.length;i++){
            String S=strs[i];
            while(prelen>S.length() || !pre.equals(S.substring(0,prelen))){
                prelen--;
                if(prelen==0){
                    return "";
                }
                pre=pre.substring(0,prelen);
            }
        }
        return pre;
    }
}
