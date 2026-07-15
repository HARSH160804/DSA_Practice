class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> map = new HashMap<>();
        int length=s.length();
        int low =0;
        int res = 0;   

        for(int high=0;high<length;high++)
        {
            char ch = s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            while(map.get(ch) > 1 )
            {
                char c = s.charAt(low);
                map.put(c,map.getOrDefault(c,0)-1);
                low++;
            }

            res = Math.max(res,high-low+1);
        }

        return (s == "")?0:res;
        
    }
}