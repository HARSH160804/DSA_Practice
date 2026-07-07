/*
Given an array arr[] of distinct integers and a value sum, find the count of triplets (i, j, k), having (i<j<k) with the sum of (arr[i] + arr[j] + arr[k]) smaller than the given value sum.

Examples :

Input: sum = 2, arr[] = [-2, 0, 1, 3]
Output:  2
Explanation: Triplets with sum less than 2 are (-2, 0, 1) and (-2, 0, 3). 
Input: sum = 12, arr[] = [5, 1, 3, 4, 7]
Output: 4
Explanation: Triplets with sum less than 12 are (1, 3, 4), (5, 1, 3), (1, 3, 7) and (5, 1, 4).

*/
class Solution {
    int countTriplets(int sum, int arr[]) {
        
        int length = arr.length;
        int c =0;
        Arrays.sort(arr);
        
        
        for(int i=0;i<length-2;i++)
        {
            
            
            int low= i+1;
            int high = length-1;
            
            
            //2 sum
            while (low < high)
            {
                int curr = arr[i] + arr[low] + arr[high];

                if (curr < sum) 
                {
                    c += (high - low); // important 
                  /*
                  basically 
                  12345
                  1 lock
                  2 low
                  5 high and suppose sum is 10 so 1 2 5 is 8 everything in between will be less than 8 and how many in between is just high-low
                  */
                    low++;
                } 
                else 
                {
                        high--;
                }
            }
        }
        
        return c;
        
    }
    
}
