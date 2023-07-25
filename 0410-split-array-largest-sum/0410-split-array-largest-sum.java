class Solution {
    public static int Countsplit(int nums[],int sum){
        int n = nums.length;
        int size = 1;
        int total = 0;
        for(int i=0;i<n;i++){
            if(total + nums[i] <= sum){
                total = total + nums[i];
            }
            else{
                size++;
                total = nums[i];
            }
        }
        return size;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        if(k > n){
            return -1;
        }
        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();
        while(low<=high){
            int mid = (low+high)/2;
            int split = Countsplit(nums,mid);
            if(split > k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
}