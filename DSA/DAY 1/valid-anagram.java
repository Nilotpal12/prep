class Solution {
    public boolean isAnagram(String s, String t) {
        int[] key = new int[26];
        int[] compare = new int[26];

        if(s.length()!=t.length()) return false;

        for(Character c: s.toCharArray()){
            key[c-'a']++;
        }

        for(Character c: t.toCharArray()){
            compare[c-'a']++;
        }

        return Arrays.equals(key, compare);
    }
}