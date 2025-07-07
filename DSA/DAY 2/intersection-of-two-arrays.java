class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set  = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int n: nums1){
            if(!set.contains(n)) set.add(n);
        }

        for(int n: nums2){
            if(set.contains(n)){
                list.add(n);
                set.remove(n);
            }
        }

        int[] result = new int[list.size()];
        int in = 0;

        for(Integer i : list){
            result[in++] = i;
        }

        return result;
    }
}