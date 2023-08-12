class Solution {
    public void delete(int[] arr,int index,int length){
        for(int i=index+1;i<length;i++){
            arr[i-1] = arr[i];
        }
    }
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        for(int i=len-1;i>=1;i--){
            if(nums[i] == nums[i-1]){
                delete(nums,i,len);
                len--;
            }
        }
        return len;
    }
}