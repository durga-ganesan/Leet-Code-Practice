class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int temp=sum+nums[i];
            if(temp<nums[i])
                sum=nums[i];
            else
                sum=temp;
            if(max<sum)
                max=sum;
        }
        return max;
    }
}
