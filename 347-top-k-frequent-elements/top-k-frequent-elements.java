class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);

            }
            else{
                hm.put(nums[i],1);
            }
        }
        List<Map.Entry<Integer,Integer>> lis=new ArrayList<>(hm.entrySet());
        Collections.sort(lis,(a,b)->b.getValue()-a.getValue());
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=lis.get(i).getKey();
        }
        return arr;
    }
}