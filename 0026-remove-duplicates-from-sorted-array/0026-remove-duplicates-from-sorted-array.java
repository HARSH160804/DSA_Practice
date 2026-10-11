class Solution {
    public int removeDuplicates(int[] nums) {

        int low= 0;
        int high=1;
        int k=1;

        while(high<nums.length)
        {
            while(high<nums.length &&nums[high] == nums[low])
            {
                high++;
            }

            if(high<nums.length){
            nums[low+1]=nums[high];
            low++;
            high++;
            k++;
            }

        }

        return k;
    }
}