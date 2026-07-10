class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int res = Integer.MAX_VALUE;
        int low=0;
        int high=0;
        int length = nums.length;

        int sum=0;

        // made window

        for(int i=low;i<=high;i++)
        {
            sum= sum+nums[i];

        }  
            
            while(high<length)
            {
            //fire karo
            if(sum>=target)
            {
                res = Math.min(res,(high-low+1));
                sum=sum-nums[low];
                low++;
            }
                 
            // hire karte raho
            else if(sum<target)
            {
                high++;
                if(high<length){
                sum=sum+nums[high];}
            }
            }
        
        // ternary    ()? _:_
        
    return (res == Integer.MAX_VALUE) ? 0:res;
        
    }
}


/*solution two

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int low=0;
        int high=0;
        int sum =0;
        int len = nums.length;
        int res = Integer.MAX_VALUE;

        
        while(high < len)
        {
            sum = sum + nums[high];

           
            while( sum >= target)
            {
                res = Math.min(res, (high-low+1));
                sum = sum - nums[low];
                low++;
                
            }
            high++;
        }
        

        return  (res == Integer.MAX_VALUE) ? 0:res;

    }

    
}

// res  sum > = target
//(min length) 

*/