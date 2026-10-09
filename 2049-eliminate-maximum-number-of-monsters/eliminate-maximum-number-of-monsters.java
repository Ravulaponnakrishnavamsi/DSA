class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        double[] d= new double[dist.length];
        for(int i=0;i<dist.length;i++){
            d[i]=dist[i]/(double)speed[i];
        }
        Arrays.sort(d);
        int count=0;
        for(int i=0;i<dist.length;i++){
            if(d[i]>i){
                count++;
            }
            else {
                return count;
            }
        }
        return count;
    }
}