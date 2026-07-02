class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int low =0;
        int high = numbers.length -1 ;
        int sum = numbers[low]+numbers[high];
        while(low<high)
        {
            if(sum == target){
                return new int[] {low+1,high+1};
            }

            else if (sum > target){
                high -- ;
            }

            else if (sum < target){
                low ++;

            }

            sum = numbers[low]+numbers[high];
        


        }

        return null;
    }
}