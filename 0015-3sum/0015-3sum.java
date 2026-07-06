class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        
        int length = nums.length;
        Arrays.sort(nums);

        for(int i = 0;i<length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }

            int low = i+1;
            int high = length-1;

            //two pointer start 
            while(low<high)
            {
                int sum = nums[low]+nums[high];
                int target = -1*nums[i];
                if(sum==target)
                {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[low]);
                    temp.add(nums[high]);
                    ans.add(temp);
                    low++;
                    high--;

                

                    while(low<high && nums[low] == nums[low-1])
                    {
                        low++;
                    }

                    while(low<high && nums[high] == nums[high+1])
                    {
                        high--;
                    }
                }


                else if(sum>target)
                {
                    high--;
                }

                else
                {
                    low++;
                }
            }
        
        }
        return ans;






        
    }
}









