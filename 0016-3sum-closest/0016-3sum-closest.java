class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int min_diff = Integer.MAX_VALUE;
        int resultsum = 0;
        Arrays.sort(nums);


        for(int i=0;i<nums.length-2;i++)
        {

            int low= i+1;
            int high=nums.length-1;

            //two pointers
            while(low<high)
            {
                int sum=nums[low]+nums[high]+nums[i];
                int difference = Math.abs(sum-target);

                if(sum==target)
                {
                    
                    min_diff = difference;
                    low++;
                    high--;
                    resultsum = sum;

                }
                else if(sum>target)
                {
                    
                    if(difference < min_diff)
                    {
                        min_diff = difference;
                        high--;
                        resultsum = sum;
                    }
                    else {
                    high--;
                    }
                }
                else if(sum<target)
                {
                    
                    if(difference < min_diff)
                    {
                        min_diff = difference;
                        low++;
                        resultsum = sum;
                    }
                    else
                    {
                        low++;
                    }

                }

            }
        }
       return  resultsum;
       
       
        
    }
}