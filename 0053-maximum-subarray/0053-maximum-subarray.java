class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int max1 = nums[0];
        for(int i=1;i<nums.length;i++){
            max = Math.max(nums[i],max+nums[i]);
            if(max>max1){
                max1 = max;
            }
        }
        return max1;
    }
}