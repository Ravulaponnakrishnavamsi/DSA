class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int min=0;

        for(int i=0;i<weights.length;i++)
        {
            max+=weights[i];

            if(min<weights[i])
            {
                min=weights[i];
            }
        }

        int low=min;
        int high=max;
        int ans=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;

            boolean value = ispossible(weights,days,mid);

            if(value)
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

    public boolean ispossible(int []weights,int days,int capacity)
    {
        int load=0,d=1;
        for(int i=0;i<weights.length;i++)
        {
            if(load+weights[i]>capacity)
            {
                d++;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        if(d<=days)
        {
            return true;
        }
        return false;
    }
     
    
}