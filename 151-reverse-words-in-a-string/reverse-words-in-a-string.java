class Solution {
    public String reverseWords(String s) {
        
        String sp="";

        s=s.trim();

        String words[]=s.split("\\s+");

        for(int i=words.length-1;i>=0;i--)
        {
            System.out.print(words[i]);
            if(i!=0)
            {
            sp+=words[i]+" ";
            }
            else{
                sp+=words[i];
            }
        }
        return sp;
    }
}