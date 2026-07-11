class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        

        int res = Integer.MAX_VALUE;
        int length = nums.length;
        int low=0;
        int sum =0;

        //hiring loop -> step 1 .
        for(int high=0;high<length;high++)
        {
            sum = sum + nums[high];
            
            //condition and firing  {static mai if}
            while(sum>=target)
            {
                res = Math.min(res,high-low+1);
                sum = sum-nums[low];
                low++;
            }

        }
        return (res == Integer.MAX_VALUE)? 0:res;
    }
}