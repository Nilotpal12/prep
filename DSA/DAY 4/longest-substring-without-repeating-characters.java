class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int left = 0, right = 0;
        Set<Character> set = new HashSet<>();

        while(right<s.length()){

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            length = Math.max(length,right-left+1);
            right++;

        }

        return length;
    }
}