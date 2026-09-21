class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);


        for(int i=0;i<=nums.length-2;i++)
        {
            //edge case of duplicate element
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }

            // two pointers 
            
            int high=nums.length-1;
            int low=i+1;
            
            int target = -1*nums[i];

            while(low<high)
            {
                int sum = nums[low]+nums[high];
                if(sum==target)
                {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[low]);
                    temp.add(nums[high]);
                    ans.add(temp);
                    low++;
                    high--;

                    //edgecase
                    while(low<high && nums[low]==nums[low-1])
                    {
                        low++;
                    }

                    while(low<high && nums[high] == nums[high+1])
                    {
                        high--;
                    }

                }

                if(sum>target)
                {
                    high--;
                }

                if(sum<target)
                {
                    low++;
                }
            }    

        }
        return ans;


    }
}