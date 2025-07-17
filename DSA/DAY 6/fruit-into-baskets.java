class Solution {
    public int totalFruit(int[] fruits) {
        int buckets = 2;
        Map<Integer,Integer> map = new HashMap<>();
        int length = 0;
        int left = 0, right = 0;

        while(right<fruits.length){

            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

            while(map.size()>buckets){
                map.put(fruits[left],map.getOrDefault(fruits[left],0)-1);

                if(map.get(fruits[left])==0) map.remove(fruits[left]);
                left++;
            }

            length = Math.max(length,right-left+1);
            right++;
        }
        return length;
    }
}