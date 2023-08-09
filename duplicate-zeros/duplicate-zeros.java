class Solution {
    public void create(int[] arr,int index){
        for(int i=arr.length-2;i>=index;i--){
            arr[i+1] = arr[i];
        }
    }
    public void duplicateZeros(int[] arr) {
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i] == 0){
                create(arr,i);
                arr[i] = 0;
            }
        }
    }
}