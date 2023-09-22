class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        int even =0;
        for(int i=0;i<len;i++){
            if(nums[i] % 2 ==0){
                even++;
            }
        }
        int evens[] = new int[even];
        int odds[] = new int[len-even];
        int k=0;
        int l=0;
        for(int i=0;i<len;i++){
            if(nums[i]%2 == 0){
                evens[k] = nums[i];
                k++;
            }
            else{
                odds[l] = nums[i];
                l++;
            }
        }
        for(int i=0;i<even;i++){
            nums[i] = evens[i];
        }
        int p=0;
        for(int i=even;i<len;i++){
            nums[i]= odds[p];
            p++;
        }
        
        return nums;
    }
}