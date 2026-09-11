class Solution {

    public int max(int nums[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        return max;
    }

    public int ispossible(int nums[],int k)
    {
        int totalValue=0;
        for(int i=0;i<nums.length;i++)
        {
            totalValue+=(nums[i]+k-1)/k;
        }
        return totalValue;
    }
    public int smallestDivisor(int[] nums, int threshold)
    {
        
        int low=1;
        int high=max(nums);

        int ans=high;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int value=ispossible(nums,mid);

            if(value<=threshold)
            {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}