class Solution {

    public boolean isAnagram(HashMap<Character,Integer>hma,HashMap<Character,Integer>hmb)
    {
        if(hma.size()!=hmb.size())
        {
            return false;
        }

        for(char ch : hma.keySet())
        {
            if(!(hmb.containsKey(ch)))
            {
                return false;
            }

            int a = hma.get(ch);
            int b = hmb.get(ch);

            if(a!=b)
            {
                return false;
            }
        }

        return true;
    }
    public List<Integer> findAnagrams(String s, String p) 
    {
        
        ArrayList<Integer> arr = new ArrayList<>();

        int l=0;
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();

        for(int i=0;i<p.length();i++)
        {
            hm1.put(p.charAt(i),hm1.getOrDefault(p.charAt(i),0)+1);
        }
        int k = p.length();
        for(int r=0;r<s.length();r++)
        {
            hm2.put(s.charAt(r),hm2.getOrDefault(s.charAt(r),0)+1);

            if(r-l==k)
            {
                hm2.put(s.charAt(l),hm2.get(s.charAt(l))-1);
                if(hm2.get(s.charAt(l))==0)
                {
                    hm2.remove(s.charAt(l));
                }
                l++;
            }

            if(r-l+1==k)
            {
                boolean isValid= isAnagram(hm1,hm2);
                if(isValid)
                {
                    arr.add(l);
                }
            }
        }
        return arr;
    }   

}