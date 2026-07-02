class Solution {
    public int removeDuplicates(int[] nums) {

        int l =1;
        int h = 2;
        int k= 2;
        

        while(h<nums.length)
        {
           if(nums[h] == nums[l-1]){
            h++;
           }

           else{
            l++;
            nums[l]  =  nums[h];
            h++;
            k++;
           }

        }
        return k;

        
    }
}