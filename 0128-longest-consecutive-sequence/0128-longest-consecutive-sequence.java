class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return 1;
        }
        Arrays.sort(nums);
        int count =1;
        int max = 1;
        int prev = nums[0];
        // for(int i=0;i<nums.length;i++){
        //     System.out.print(nums[i]+" ");
        // }
        for(int i=1;i<nums.length;i++){
            // int next = nums[i+1];
            if(nums[i] == prev+1){
                count++;
                // max = Math.max(max,count);
                // System.out.print(max+" ");
            }
            else if(nums[i] !=prev){
                count = 1;
            }
          max = Math.max(max,count);  
          prev = nums[i];
        }
        return max;
    }
}