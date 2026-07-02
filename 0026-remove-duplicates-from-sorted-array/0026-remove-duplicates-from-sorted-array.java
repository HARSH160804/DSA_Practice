class Solution {
    public int removeDuplicates(int[] nums) {

        int l = 0;
        int h= 1;
        int k= 1;

      while (l<h && h < nums.length)  
      {
        if (nums[h] == nums[l]) { 
            h++;
            }

        else {
        l++;
        nums[l] = nums[h];
        k++;
        h++;
        }
        

      }

      return k;
        
    }
}