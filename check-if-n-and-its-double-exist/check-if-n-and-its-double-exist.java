class Solution {
    public boolean checkIfExist(int[] arr) {
        int len = arr.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(arr[i] == 2 * arr[j]){
                    if(i != j){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}