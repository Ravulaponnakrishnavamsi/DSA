class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0;
        int r=0;

        int sum=0;
        int cnt=0;

        for(int i=0;i<arr.length;i++)
        {
            r=i;
            sum+=arr[r];

            if(r-l==k)
            {
                sum=sum-arr[l];
                l+=1;
            }
            if(r-l+1==k){
                int avg=sum/k;
                if(avg>=threshold)
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}