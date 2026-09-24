class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
        int low=0;
        int high=0;
        int count=0;
        int prod=1;

        if(k<=1)
        {
            return count;
        }

        while(high<nums.length)
        {
            prod=prod*nums[high];
            
            while(prod>=k)
            {
                prod = prod/nums[low];
                low++;
            }

            count=count+high-low+1;
            high++;
        }
        
        return count;
    }
}