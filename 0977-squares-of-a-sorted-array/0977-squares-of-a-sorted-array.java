class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];
        
        int low=0;
        int high =nums.length -1;
        int k=nums.length -1;
        while(low<=high)
        {
            int e1= nums[low]*nums[low];
            int e2= nums[high]*nums[high];

            if(e2>=e1)
            {
                result[k] = e2;
                k--;
                high--;
            }
            else if(e1>e2)
            {
                result[k] = e1;
                k--;
                low++;
            }
        }
        return result;
    }
}