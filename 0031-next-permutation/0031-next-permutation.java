class Solution {
    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    private void reverse(int[] A, int start, int end) {
        while (start < end) {
            swap(A, start++, end--);
        }
    }
    public void nextPermutation(int[] A) {
        // int len = nums.length;
        // //  List<Integer> a = new ArrayList<Integer>(Arrays.asList(nums));
        // // List a = Arrays.asList(nums);
        // int index =-1;
        // for(int i=len-2;i>=0;i--){
        //     if(nums[i] < nums[i+1]){
        //         index = i;
        //         break;
        //     }
        // }
        // if(index == -1){
        //     reverse(nums,i,len-1);
        // }
        // for(int i=len-1;i>index;i--){
        //     if(nums[i] < nums[index]){
        //         int temp = a.get(i);
        //         a.set(i,a.get(index));
        //         a.set(index,temp);
        //         break;
        //     }
        // }
        // // List<Integer> sublist = nums.sublist(index+1,len);
        // // Collections.reverse(sublist); 
        // reverse(nums,index+1,len-1);
        int N = A.length;
        int i;
        int j;

        for (i = N - 2; i >= 0; i--) {
            if (A[i] < A[i + 1])
                break;
        }

        if (i >= 0) {
            for (j = N - 1; j > i; j--) {
                if (A[i] < A[j])
                    break;
            }
            swap(A, i, j);
        }
        reverse(A, i + 1, N - 1);
    }
}