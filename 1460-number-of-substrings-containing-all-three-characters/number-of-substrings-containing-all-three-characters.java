class Solution {
    public int numberOfSubstrings(String s) {
        

        HashMap<Character,Integer> hm = new HashMap<>();

        int l=0;
    
        int count=0;

        for(int r=0;r<s.length();r++)
        {
            char ch = s.charAt(r);

            hm.put(ch,hm.getOrDefault(ch,0)+1);

            while(hm.size()==3)

            {
                
                char ch1 = s.charAt(l);

                hm.put(ch1,hm.get(ch1)-1);

                if(hm.get(ch1)==0)
                {
                    hm.remove(ch1);
                }
                l++;
            }
            count+=l;
        }
        return count;
    }
}