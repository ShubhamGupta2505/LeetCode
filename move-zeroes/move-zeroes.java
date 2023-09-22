class Solution {
    public void moveZeroes(int[] nums) {
        int nozero = 0;
        int len = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                nozero++;
            }
        }
        int num[] = new int[nums.length];
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                num[k] = nums[i];
                k++;
            }
        }
        for(int i=len-nozero;i<nums.length;i++){
            num[i] = 0;
        }
        for(int i=0;i<len;i++){
            nums[i] = num[i];
        }
    }
}