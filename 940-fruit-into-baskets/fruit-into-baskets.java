class Solution {
    public int totalFruit(int[] fruits) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        int l=0;
        int max=0;
        for(int i=0;i<fruits.length;i++)
        {

            int  r=i;

            hm.put(fruits[r],hm.getOrDefault(fruits[r],0)+1);

            while(hm.size()>2)
            {
                hm.put(fruits[l],hm.get(fruits[l])-1);
                if(hm.get(fruits[l])==0)
                {
                    hm.remove(fruits[l]);
                }
                l++;
            }
            max=Math.max(max,r-l+1);
        }

        return max;
    }
}