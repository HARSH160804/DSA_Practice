class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int low=0;
        int high=0;
        int minsize=Integer.MAX_VALUE;
        int sum=0;


        while(high<nums.length)
        {
           sum=sum+nums[high];

           while(sum>=target)
           {
            minsize=Math.min(minsize,high-low+1);
            sum=sum-nums[low];
            low++;
           }


           high++;



           
        }

  return minsize==Integer.MAX_VALUE ? 0:minsize ;
        
    }
}