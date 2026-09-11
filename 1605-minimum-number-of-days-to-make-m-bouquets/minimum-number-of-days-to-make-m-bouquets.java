class Solution {

    public int[] maxmin(int[] bloomDay)
    {
         int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]>max)
            {
                max=bloomDay[i];
                
            }
            if(bloomDay[i]<min)
            {
                min=bloomDay[i];
            }
        }
        return new int[]{max,min};
    }

    public int minDays(int[] bloomDay, int m, int k) 
    {
        if((long)m * k > bloomDay.length)
        {
                return -1;
        }
        int max[]=maxmin(bloomDay);
        int low=max[1];
        int high=max[0];
        int ans=high;
        while(low<=high)
        {
            int mid=low+(high-low)/2;

            
            boolean value=ispossible(bloomDay,m,k,mid);

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
    public boolean ispossible(int []bloomDay,int m,int k,int d)
    {


        int took1=0;
        int cnt1=0;

        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]<=d)
            {
                cnt1++;
            }
            else{
                took1+=cnt1/k;
                cnt1=0;
            }
        }
        took1+=cnt1/k;

       if(took1>=m)
       {
        return true;
       }
       return false;


    }

    

}