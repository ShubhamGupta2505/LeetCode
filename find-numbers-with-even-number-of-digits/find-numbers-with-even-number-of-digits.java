class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            String t = String.valueOf(temp);
            int len = t.length();
            if(len % 2 == 0){
                count++;
            }
        }
        return count;
    }
}