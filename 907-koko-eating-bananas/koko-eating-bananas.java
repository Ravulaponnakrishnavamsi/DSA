class Solution{
    public int max(int[] piles)
    {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<piles.length;i++)
        {
            if(max<piles[i])
            {
                max=piles[i];
            }
        }
        return max;
    }
    
    public int minEatingSpeed(int[] piles, int h)
    {
        int low=1;
        int high=max(piles);
        int ans=high;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            long time=caluclateTotalhours(piles,mid);
            if(time<=h)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }

        return ans;
    }
    
    public long caluclateTotalhours(int []piles,int k)
    {

        long totalhours=0;
        for(int i=0;i<piles.length;i++)
        {

           totalhours += (piles[i] + k - 1) / k;

        }

        return totalhours;
        
    }
}