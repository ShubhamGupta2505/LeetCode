class Solution {
    public int max(int[] arr,int i){
        int max1 = arr[i];
        for(int j =i;j<arr.length;j++){
            if(max1<arr[j]){
                max1 = arr[j];
            }
        }
        return max1;
    }
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            arr[i] = max(arr,i+1);
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}