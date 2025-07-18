class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];

        for(char ch: s1.toCharArray()){
            s1Freq[ch-'a']++;
        }

        for(int i=0;i<s2.length();i++){

            s2Freq[s2.charAt(i)-'a']++;

            if(i>=s1.length()){
                s2Freq[s2.charAt(i-s1.length())-'a']--;
            }

            if(match(s1Freq,s2Freq)) return true;

        }

        return false;
    }

    public boolean match(int[] a, int[] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]) return false;
        }

        return true;
    }
}