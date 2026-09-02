class Solution {
    public boolean isPalindrome(String s) {
       s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");

       int j=s.length()-1;
       
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                
                return false;
            }
        }
        return true;
    }
}