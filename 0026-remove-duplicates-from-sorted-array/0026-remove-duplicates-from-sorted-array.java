class Solution {
    public int removeDuplicates(int[] nums) {

        int low=0;
        int high=low+1;
        int k =1;
        

        while(low<high && high<nums.length)
        {
            if(nums[high]== nums[low])
            {
                high++;
            }
            else 
            {
                low++;
                nums[low]=nums[high];
                high++;
                k++;
            }
           









        }
        return k;
    }
}