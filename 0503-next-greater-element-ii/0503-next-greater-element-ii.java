class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int nge[] = new int[nums.length];
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            int next = -1;
            for(int j=i+1;j<=2*n-1;j++){
                if(nums[j%n]>nums[i]){
                    next = nums[j%n];
                    break;
                }
            }
            nge[i] = next;
        }
        return nge;
    }
}