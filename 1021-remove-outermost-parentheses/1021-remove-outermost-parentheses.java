class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int count =0;
        int max =0;
        int arr[] = new int[n];
        String s1 = "";
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '('){
                count++;
                if(count > 1){
                    s1 = s1 + s.charAt(i);
                }
            }
            else{
                count--;
                if(count>0){
                    s1 = s1+s.charAt(i);
                }
            }
        }
        
        // ArrayList<String> array = new ArrayList<String>();
        // // String s1[] = new String[];
        // for(int i=0;i<n;i++){
        //     if
        // }
        return s1;
    }
}