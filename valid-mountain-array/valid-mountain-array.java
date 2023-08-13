class Solution {
//     public boolean check(int[] arr,int start,int end){
//         int a[] = new int[arr.length];
//         a = arr;
//         Arrays.sort(a);
        
//     }
    public boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if (arr.length < 3)
            return false;
        int flag = 0, i = 0;
        for (i = 1; i < arr.length; i++)
            if (arr[i] <= arr[i - 1])
                break;
 
        if (i == arr.length || i == 1)
            return false;
 
        for (; i < arr.length; i++)
            if (arr[i] >= arr[i - 1])
                break;
        return i == arr.length;
    }
}