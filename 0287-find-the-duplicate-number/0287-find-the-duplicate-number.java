class Solution {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int flag =0;
        for(int i=0;i<len;i++){
            int a = (i+1)%len;
            if(nums[i] == nums[a])
            flag = nums[i];
            // System.out.print(nums[i]+" ");
        }
        return flag;
    }
}