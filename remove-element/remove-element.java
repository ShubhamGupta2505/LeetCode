class Solution {
    public void delete(int[] arr,int index,int length){
        for(int i=index+1;i<length;i++){
            arr[i-1] = arr[i];
        }
    }
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i] == val){
                delete(nums,i,len);
                len--;
            }
            
        }
        return len;
        
    }
}