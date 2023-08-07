class Solution {
    public int climbStairs(int n) {
        int prev = 1;
        int prev2 =1;
        for(int i=1;i<n;i++){
            int temp = prev2+prev;
            prev2 = prev;
            prev = temp;
        }
        return prev;
    }
}
// for i in range(2, n+1):
//             cur_i = prev2 + prev
//             prev2 = prev
//             prev = cur_i
//         return prev