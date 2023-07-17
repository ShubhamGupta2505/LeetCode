class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // List<List<Integer>> res = new ArrayList<List<Integer>>();
        // if(nums.length == 0 || nums==null){
        //     return res;
        // }
        // int n = nums.length;
        // Arrays.sort(nums);
        // for(int i=0;i<n;i++){
        //     System.out.print(nums[i]+" ");
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         long target_2 = target - nums[i] - nums[j];
        //         int left = j+1;
        //         int right = n-1;
        //         while(left<right){
        //             long two_sum = nums[left]+nums[right];
        //             if(two_sum<target_2){
        //                 left++;
        //             }
        //             else if(two_sum>target_2){
        //                 right--;
        //             }
        //             else{
        //                 List<Integer> quad = new ArrayList<>();
        //                 quad.add(nums[i]);
        //                 quad.add(nums[j]);
        //                 quad.add(nums[left]);
        //                 quad.add(nums[right]);
        //                 res.add(quad);
        //                 while(left<right && nums[left] == quad.get(2)){
        //                     left++;
        //                 }
        //                 while(left<right && nums[right]== quad.get(3)){
        //                     right--;
        //                 }
        //             }
        //         }
        //         while(j+1<n && nums[j+1] == nums[j]){
        //             ++j;
        //         }
        //     }
        //     while(i+1<n && nums[i+1] == nums[i]){
        //         ++i;
        //     }
        // }
        // return res;
        int n = nums.length; // size of the array
        List<List<Integer>> ans = new ArrayList<>();

        // sort the given array:
        Arrays.sort(nums);

        // calculating the quadruplets:
        for (int i = 0; i < n; i++) {
            // avoid the duplicates while moving i:
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n; j++) {
                // avoid the duplicates while moving j:
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                // 2 pointers:
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);
                        k++;
                        l--;

                        // skip the duplicates:
                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    } else if (sum < target) k++;
                    else l--;
                }
            }
        }

        return ans;
    }
}