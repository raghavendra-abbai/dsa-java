class Solution {
    public int findLengthOfLCIS(int[] nums) {

        int count =  1 ;

        int max = 1 ;

        for(int i = 1 ; i<nums.length ; i++){

            if(nums[i] > nums[i-1]){
                count = count +1 ;
            }
            else {
               count = 1 ;
            }

            max = Math.max(max,count);




        
        }

   return max ;
        
    }
}