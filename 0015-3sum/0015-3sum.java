class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        { 
            //edge case of duplicate element
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }

            int low = i+1;
            int high = nums.length-1;
            while(low<high)
            {
                int sum = nums[i]+nums[low]+nums[high];
                if(sum<0)
                {
                    low++;
                }
                else if(sum>0)
                {
                    high--;
                }
                else if(sum == 0)
                {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[low]);
                    temp.add(nums[high]);
                    list.add(temp);
                    low++;
                    high--;


                    // Skip duplicate low values
                    while (low < high && nums[low] == nums[low - 1]) 
                    {
                         low++;
                    }

                    // Skip duplicate high values
                    while (low < high && nums[high] == nums[high + 1]) 
                    {
                    high--;
                     }

                }

            


            }
        }
        return list;
    }
}