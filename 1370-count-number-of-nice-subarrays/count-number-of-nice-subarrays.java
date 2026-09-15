class Solution {

    public int atmostk(int nums[],int k)
    {
         int l=0;
        int codd=0;
        int max=0,k1=0;
        for(int r=0;r<nums.length;r++)
        {
            if(nums[r]%2==1)
            {
                codd+=1;
            }
            while(codd>k)
            {
                if(nums[l]%2==1)
                {
                    codd--;
                }
                l++;
            }

            k1+= r - l + 1;
        }
        return k1;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        
       return atmostk(nums,k)-atmostk(nums,k-1);
    }
}