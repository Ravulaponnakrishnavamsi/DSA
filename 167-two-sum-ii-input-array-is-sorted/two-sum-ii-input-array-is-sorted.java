class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[] = new int[2];

        HashMap<Integer,Integer> hm = new HashMap<>();
        int index=0;
        for(int i=0;i<numbers.length;i++){

            int contain=target-numbers[i];
            if(hm.containsKey(contain))
            {
                arr[index]=hm.get(contain)+1;
                arr[index+1]=i+1;
                break;

            }
            hm.put(numbers[i],i);

        }
        return arr;
    }
}