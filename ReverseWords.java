class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length;i++){
            sb.append(str[str.length-i-1]);
            sb.append(" ");
        }
        String REV=sb.toString().trim();
        return REV;
    }
}
