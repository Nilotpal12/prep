class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length()) return false;
        char cs = 'a', ss = 'a';
        
        Map<Character,Character> mapS = new HashMap<>();
        Map<Character,Character> mapT = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            cs = s.charAt(i);
            ss = t.charAt(i);

            if(mapS.containsKey(cs)){
                if(mapS.get(cs)!=ss) return false;
            }else{
                mapS.put(cs, ss);
            }

            if(mapT.containsKey(ss)){
                if(mapT.get(ss)!=cs) return false;
            }else{
                mapT.put(ss,cs);
            }
        }

        return true;
    }
}