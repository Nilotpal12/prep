class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        Map<Character,Integer> tmap = new HashMap<>();
        Map<Character,Integer> smap = new HashMap<>();

        for(char c: t.toCharArray()) tmap.put(c,tmap.getOrDefault(c,0)+1);

        int size = tmap.size();
        int currentSize = 0;
        int left = 0, right = 0, start = 0;
        int length = Integer.MAX_VALUE;

        while(right<s.length()){
            char c = s.charAt(right);

            smap.put(c,smap.getOrDefault(c,0)+1);

            if(tmap.containsKey(c)&&(smap.get(c).intValue()==tmap.get(c).intValue())) currentSize++;

            while(size==currentSize){
                if(length > right-left+1){ 
                    start = left;
                    length = right-left+1;
                }

                char l = s.charAt(left);
                smap.put(l,smap.getOrDefault(l,0)-1);

                if(tmap.containsKey(l)&&(smap.get(l).intValue()<tmap.get(l).intValue())){
                    currentSize--;
                }
                left++;
            }
            right++;

        }
        return length==Integer.MAX_VALUE? "": s.substring(start,start+length);
    }
}