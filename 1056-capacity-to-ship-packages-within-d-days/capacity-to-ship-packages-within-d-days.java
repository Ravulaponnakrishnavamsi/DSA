class Solution {
    public boolean ispossible(int []weights,int day,int k){
        int temp=0;
        for(int i=0;i<weights.length;i++){
            int value=weights[i];

            if(value>k){
                return false;
            }
            if(value+temp>k){
                day-=1;
                temp=0;
            }
            temp+=value;
            if(day==0){
                return false;
            }
            
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=1;
        int r=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(ispossible(weights,days,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}