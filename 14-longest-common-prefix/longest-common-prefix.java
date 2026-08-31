class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }

        String prefix=strs[0];
        int prefix_length=prefix.length()-1;
        for(int i=1;i<strs.length;i++){
            String s=strs[i];

            while(prefix.length()>s.length() || (!s.startsWith(prefix))){
                prefix=prefix.substring(0,prefix.length() - 1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}