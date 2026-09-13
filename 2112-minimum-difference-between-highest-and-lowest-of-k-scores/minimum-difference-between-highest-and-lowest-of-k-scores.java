class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int l=0;
        int r=0;
        int min = Integer.MAX_VALUE;
        for( r=0;r<nums.length;r++)
        {

            if(r-l+1==k)
            {
                int diff=nums[r]-nums[l];
                min = Math.min(diff,min);
                l++;
            }
        }
        return min;
    }
   
}