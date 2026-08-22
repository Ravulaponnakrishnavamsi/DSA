class Solution {
    public boolean checkDivisibility(int n) {
        

        int sum=0;
        int pro=1;
        int temp=n;
        
        while(n>0){
            int rem=n%10;
            sum+=rem;

            pro*=rem;
            System.out.println(sum);
            System.out.println(pro);
            n/=10;
        }
        
        

        return (temp%(sum+pro)==0);
    }
}