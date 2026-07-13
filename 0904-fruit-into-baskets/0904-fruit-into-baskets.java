class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int low=0;
        int length = fruits.length;
        int res = Integer.MIN_VALUE;

        for(int high=0;high<length;high++)
        {
            int num = fruits[high];
            map.put(num,map.getOrDefault(num,0) +1);

            if(map.size() > 2)
            {
                int n = fruits[low];

                map.put(n,map.getOrDefault(n,0) -1);
                if(map.get(n) == 0)
                {
                    map.remove(n);
                }
                low++;

            }

            


            if(map.size() <= 2)
            {
                res = Math.max(res,high-low+1);
            }
        }
        return (res == Integer.MIN_VALUE) ? 1:res;
    }
}