class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int length = nums.length;
        
        Arrays.sort(nums);
        int min_difference = Integer.MAX_VALUE;
        int result_sum = 0;

        for(int i=0;i<length-2;i++)
        {
            int low = i+1;
            int high=length-1;
            

            //two pointer

            while(low<high)
            {
                int sum = nums[i]+nums[low]+nums[high];
                int difference = Math.abs(target-sum);

                if(sum==target)
                {
                    min_difference=difference;
                    result_sum=sum;
                    low++;
                    high--;

                }

                if(sum>target)
                {
                    if(difference< min_difference)
                    {
                     min_difference=difference;
                     result_sum=sum;

                    }

                    high--;
                }
                
                if(sum<target)
                {
                    if(difference< min_difference)
                    {
                     min_difference=difference;
                     result_sum=sum;

                    }

                    low++;
                }
                
               
            }

        }
        return  result_sum;
    }
}