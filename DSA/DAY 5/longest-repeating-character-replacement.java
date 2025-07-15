class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];
        int maxFreq = -1, left = 0, length = -1;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            freq[c-'A']++;

            maxFreq = Math.max(maxFreq,freq[c-'A']);

            while(((i-left+1)-maxFreq)> k){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            length = Math.max(length, i-left + 1);
        }

        return length;
    }
}