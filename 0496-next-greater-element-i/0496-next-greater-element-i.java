class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nge[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int next =-1;
            int num = nums1[i];
            boolean found = false;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    found =true;
                }
                if(found && nums2[j]>num){
                    next = nums2[j];
                    break;
                }
                
            }
            nge[i] = next;
        }
        return nge;
    }
}