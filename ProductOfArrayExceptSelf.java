class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prev=1;
        int next=1;
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            res[i]=1;
        }
        for(int i=0;i<n;i++){
            res[i] *=prev;
            prev*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            res[i]*= next;
            next *=nums[i];
        }
        return res;
    }
}
