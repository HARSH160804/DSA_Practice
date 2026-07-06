class Solution {
    public int[] sortedSquares(int[] nums) {

        int result[] = new int[nums.length];
        int k=nums.length-1;
        int low = 0;
        int high= nums.length-1;

        while(low<=high)
        {
            int leftsquare = nums[low]*nums[low];
            int rightsquare =nums[high]*nums[high];

            

            if(rightsquare>leftsquare)
            {
                result[k]=rightsquare;
                high--;
                k--;
            }
            else 
            {
               result[k]=leftsquare;
               low++;
                k--; 
            }
            
        }
        
        
        return result;

        
    }
}