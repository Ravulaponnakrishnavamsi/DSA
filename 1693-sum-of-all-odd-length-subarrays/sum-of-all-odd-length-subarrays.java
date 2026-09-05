class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        

        int total=0;
        for(int i=0;i<arr.length;i++)
        {
            int f=0;
           
            for(int j=i;j<arr.length;j++)
            {
                 int sum=0;
                if(f%2==0)
                {    
                
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                   
                }
                
                total+=sum;
               
                }
                
                f=1-f;
                
            }
            
        }
        return total;
    }
}