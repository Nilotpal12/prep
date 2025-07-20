class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        Map<String,Integer> wordMap = new HashMap<>();
        List<Integer> results = new ArrayList<>();

        for(String word:words) wordMap.put(word,wordMap.getOrDefault(word,0)+1);

        int wordLength = words[0].length();
        int windowSize = wordLength * words.length;

        for(int i=0; i<wordLength; i++){
            int left =i, right = i;

            Map<String,Integer> seen = new HashMap<>();

            while((right+wordLength)<=s.length()){

                String current = s.substring(right, right+wordLength);
                right += wordLength;
                seen.put(current,seen.getOrDefault(current,0)+1);
               

                while(wordMap.getOrDefault(current,0) < seen.get(current)){

                    String leftCurrent = s.substring(left, left+wordLength);
                    seen.put(leftCurrent, seen.get(leftCurrent)-1);
                    left += wordLength;
                }

                if(right-left==windowSize) results.add(left);
            }
        }

        return results;
        
    }
}