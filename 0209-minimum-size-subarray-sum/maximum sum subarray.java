class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int low=0;
        int high=k-1;
        int res = Integer.MIN_VALUE;
        int sum =0;
        int length=arr.length;

        //create window
        for(int i=0;i<k;i++)
        {
            sum = sum+arr[i];
        }

        //slide the window :)
        
        while(high<length)
        {
            res = Math.max(sum,res);
            high++;
            
            if(high<length)
            {
                sum=sum+arr[high]-arr[low];
                low++;
            }
        }
        
        
        
        return res;
    }
}
