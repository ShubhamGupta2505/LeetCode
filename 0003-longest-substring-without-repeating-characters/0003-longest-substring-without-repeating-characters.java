class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> seen = new HashMap<>(); 
    int max = 0;
    int start = 0;
    for(int i = 0; i< s.length(); i++)
    {
      if(seen.containsKey(s.charAt(i)))
      {
        start = Math.max(start, seen.get(s.charAt(i)) + 1);
      }
      seen.put(s.charAt(i), i);
      max = Math.max(max, i-start + 1);
    }
    return max;
    }
}