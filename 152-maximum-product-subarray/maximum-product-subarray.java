class Solution {
    public int maxProduct(int[] nums) {
        
        int maxpro=Integer.MIN_VALUE;
        int pro=1;
        

        for(int i=0;i<nums.length;i++){

            pro=1;
            for(int j=i;j<nums.length;j++){
                pro=pro*nums[j];

                maxpro=Math.max(maxpro,pro);
            }
           
            
        }
        return maxpro;
    }
}




