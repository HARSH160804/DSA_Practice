class Solution {
    public int[] sortedSquares(int[] nums) {
        //piche se bharna shuru karo in new array
        int low=0;
        int high=nums.length-1;
        int k=nums.length-1;
        int[] result = new int[nums.length];

        while(low<=high)
        {
            int e1= (int)Math.pow(nums[low] , 2);
            int e2= (int)Math.pow(nums[high] , 2);

            if(e2>=e1)
            {

                
                result[k]= e2;

                k--;;
                high--;
            }
            else 
            if(e1>e2)
            {
                result[k]= e1;
                low++;
                k--;;
            }

            
        }
        return result;

        
    }
}