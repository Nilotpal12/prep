class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int[] pFreq = new int[26];
        int[] sFreq = new int[26];

        for(char c: p.toCharArray()) pFreq[c-'a']++;
        List<Integer> list = new ArrayList<>();

        int left = 0;

        for(int i=0;i<s.length();i++){
            char ss = s.charAt(i);

            sFreq[ss-'a']++;

            if(i>=p.length()){
                sFreq[s.charAt(i-p.length())-'a']--;
            }

            if(isAnagram(pFreq,sFreq)) list.add(i-p.length()+1);
        }

        return list;

    }

    public boolean isAnagram(int[] a, int[] b){

        if(a.length!=b.length) return false;

        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i])  return false;
        }
        return true;
    }
}