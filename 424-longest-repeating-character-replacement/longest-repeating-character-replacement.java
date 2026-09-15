class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int l=0;
        int max=0;
        int maxFreq=0;
        for(int r=0;r<s.length();r++)
        {
            char s1 = s.charAt(r);

            hm.put(s1,hm.getOrDefault(s1,0)+1);

            maxFreq = Math.max(maxFreq, hm.get(s1));

            while((r-l+1)-maxFreq>k)
            {
                hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                if(hm.size()==0)
                {
                    hm.remove(s.charAt(l));
                }
                l++;
            }

            max=Math.max(max,r-l+1);
        }
        return max;

    }
}