class Solution {
    public int heightChecker(int[] heights) {
        int a[] = new int[heights.length];
        int len = heights.length;
        for(int i=0;i<len;i++){
            a[i] = heights[i];
        }
        Arrays.sort(a);
        int count =0;
        for(int i=0;i<len;i++){
            if(heights[i] != a[i]){
                count++;
            }
        }
        return count;
    }
}