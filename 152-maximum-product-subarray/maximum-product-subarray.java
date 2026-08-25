class Solution {
    public int maxProduct(int[] nums) {
        
        int maxpro=Integer.MIN_VALUE;
        int pro;
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=i;j<nums.length;j++){
                product=product*nums[j];
                maxpro=Math.max(product,maxpro);
            }
        }
        return maxpro;
    }
}




