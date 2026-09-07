class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
       
        double sum=0.0;
        int i=prices.length-1,j=discounts.length-1;
        while(i>=0 && j>=0){

            double p=prices[i];
            double d=discounts[j];

            //caluclate the prices
             sum+=p*(100.0-d)/100.0;
            i--;
            j--;
            
        }
        while(i>=0){
            sum+=prices[i];
            i--;
        }
        
        return sum;
    }
    
}