class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr= new ArrayList<>();
        int index=0;
        int max=0;
        for(int i=0;i<candies.length;i++){

                if(candies[i]>max){
                    max=candies[i];
                }
            }
        int sum=0;
        for(int i=0;i<candies.length;i++){
            sum=candies[i]+extraCandies;

            if(sum>=max){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }
        return arr;
    }
}