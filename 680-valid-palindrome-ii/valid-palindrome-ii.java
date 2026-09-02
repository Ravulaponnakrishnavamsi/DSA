class Solution 
{
    public boolean validPalindrome(String s) {

        int i=0;
        int j=s.length()-1;
        boolean found=false;
        int n=s.length()-1;
        int count=1;
        
        for(i=0;i<s.length();i++){
            
            if(s.charAt(i)!=s.charAt(n-i))
            {
                boolean b=ispalindrome(s,i+1,j);
                boolean c=ispalindrome(s,i,j-1);
                return b || c;
            }
            j--;
        } 
        return true;  


    }

    public static boolean ispalindrome(String s , int i ,int j){
        boolean found=true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        } 
        return true;
    }
}