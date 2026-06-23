class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        int length = nums.length;

        Arrays.sort(nums);



        for(int k=0;k<length-2;k++){
             if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            int target = -1*nums[k];
            int left = k+1;
            int right =length-1;
            

        



        //================two sum==========

        while(left<right){
            int sum = nums[left]+nums[right];
        

        if (sum==target){
            ans.add(Arrays.asList(nums[k], nums[left], nums[right]));
            left++;
            right--;
        
        
                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // ❌ You had right++
                    // right pointer should move inward
                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }

        }


        else if(sum>target){
            right--;
        }
        else if (sum<target){
            left++;
        }


        

        
         }}
        return ans;
    }
}