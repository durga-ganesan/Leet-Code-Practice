class Solution {
    public int reverse(int x) {
        int rev=0,rem;
        int temp=x;
        if(x<0) temp*=-1;
        while(temp>0){
            rem=temp%10;
            if(rev>Integer.MAX_VALUE/10||rev<Integer.MIN_VALUE)   return 0;
            rev=(rev*10)+rem;
            temp/=10;
        }
        if(x<0) rev*=-1;
        return rev;
    }

}
