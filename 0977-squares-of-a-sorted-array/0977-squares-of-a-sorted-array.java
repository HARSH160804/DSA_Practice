class Solution {
    public int[] sortedSquares(int[] nums) {

    int split = 0;
    while (split < nums.length && nums[split] < 0) {
    split++;
    }

    

    int[] a = new int[split];
    int[] b = new int[nums.length - split];
    int[] result = new int[nums.length];    

    



    // Fill a[] (negative side in reverse order + square)
        int index = 0;
        for (int k = split - 1; k >= 0; k--) {
            a[index] = nums[k] * nums[k];
            index++;
        }

    // Fill b[] (positive side + square)
         index = 0;
        for (int k = split; k < nums.length; k++) {
            b[index] = nums[k] * nums[k];
            index++;
        }

    int i=0, j=0; 
    
    int n= a.length;
    int m= b.length;
    index =0;


    //================== mergin of two array====================
    while(i<n && j<m)
    {
        if(a[i]<b[j]){
            result[index] = a[i];
            i++; 
            index++;
        }
        else{
        result[index] = b[j];
        j++; 
        index++;}
    }
    while(j<m){
        result[index] = b[j];
        j++; 
        index++;
    }

    while(i<n){
        result[index] = a[i];
            i++; 
            index++;
    }

    //==========merging array ends================

    return result;







    }
}