class Solution {
    public boolean ispossible(int []arr,int m,int k,int d)
    {
        int took=0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]<=d)
            {
                took++;
            }
            else{
                
                took=0;
            }
            if(took==k)
            {
                m-=1;
                took=0;
            }

        
            if(m==0)
            {
                return true;
            }
        }
        
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int low=1;
        int high=(int)Math.pow(10,9);
        int ans=0;
        
        while(low<=high)
        {
            int mid = low+(high-low)/2;

            if(ispossible(bloomDay,m,k,mid))
            {
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        return ans;
    }
}